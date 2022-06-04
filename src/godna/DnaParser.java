package godna;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class DnaParser {

	private static final int BOARDSIZE = DnaWriter.BOARDSIZE;

	private static ArrayList<ArrayList<String>> booleanValueList = new ArrayList<>();
	private static ArrayList<ArrayList<String>> doubleValueList = new ArrayList<>();
	private static ArrayList<ArrayList<String>> objectValueList = new ArrayList<>();

	private static ArrayList<Integer> booleanAllIndexList = new ArrayList<>();
	private static ArrayList<Integer> doubleAllIndexList = new ArrayList<>();
	private static ArrayList<Integer> objectAllIndexList = new ArrayList<>();

	private static ArrayList<Integer> booleanCurrentIndexList = new ArrayList<>();
	private static ArrayList<Integer> doubleCurrentIndexList = new ArrayList<>();
	private static ArrayList<Integer> objectCurrentIndexList = new ArrayList<>();

	private static int booleanIndex = 0;
	private static int doubleIndex = 0;
	private static int objectIndex = 0;

	private static boolean internal = false;
	private static int contextCounter = 0, iCounter = 0;

	private static String[][] outputNodes = new String[BOARDSIZE][BOARDSIZE];
	private static String[] outputNodesSeq = new String[BOARDSIZE * BOARDSIZE];
	private static int outputNodeCounter = 0, outputNodePass = 0;

	private DnaParser() {
	}

	public static void main(String[] args) {

		buildOutputs();

		try {

			File file = new File("test"); // creates a new file instance
			FileReader fr = new FileReader(file); // reads the file
			BufferedReader br = new BufferedReader(fr); // creates a buffering character input stream
			StringBuffer sb = new StringBuffer(); // constructs a string buffer with no characters

			File f = new File("genetic");

			if (f.mkdir() == true) {

				parseDna(sb, br);

			} else {
				System.out.println("Directory cannot be created");
			}

			fr.close(); // closes the stream and release the resources
			System.out.println("Contents of File: ");
			System.out.println(sb.toString()); // returns a string that textually represents the object

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("outputCounter:" + outputNodeCounter + ", passes:" + outputNodePass);
	}

	private static void buildOutputs() {

		int counter = 0;

		for (int i = 0; i < BOARDSIZE; i++) {
			for (int j = 0; j < BOARDSIZE; j++) {

				outputNodes[i][j] = "Output.points[" + i + "][" + j + "]";

				outputNodesSeq[counter++] = outputNodes[i][j];
			}
		}
	}

	private static void parseDna(StringBuffer sb, BufferedReader br) throws IOException {

		String line;
		while ((line = br.readLine()) != null) {

			if (line.startsWith("b") || line.startsWith("d") || line.startsWith("o")) {

				parseSequence(line);
			}

			if (line.contains("class")) {

				writeClass(line, br);
			}

			sb.append(line); // appends line to string buffer
			sb.append("\n"); // line feed
		}
	}

	private static void parseSequence(String line) {

		String firstChar = line.substring(0, 1);

		switch (firstChar) {
		case "b":

			parseSequence(line, booleanAllIndexList);

			break;

		case "d":

			parseSequence(line, doubleAllIndexList);

			break;

		case "o":

			parseSequence(line, objectAllIndexList);

			break;

		default:
			throw new RuntimeException("invalid sequence");
		}
	}

	private static void parseSequence(String line, ArrayList<Integer> allIndexList) {

		String[] indexes = line.split(":")[1].split(",");

		for (String index : indexes) {

			if (!index.equals("")) {
				allIndexList.add(Integer.parseInt(index));
			}
		}
	}

	private static void writeClass(String line, BufferedReader br) throws IOException {

		String raw = line.split(" ")[1];
		String className = raw;

		if (className.equals("class")) {
			className = line.split(" ")[2];
		}

		pushArrayList();

		BufferedWriter writer = new BufferedWriter(new FileWriter("genetic" + File.separator + className + ".java"));

		writer.write("package genetic;\n");
		writer.write("import java.util.ArrayList;\n");
		writer.write(parseLine(line) + "\n");

		try {

			while ((line = br.readLine()) != null) {

				if (!line.startsWith("<endClass/>")) {

					if (!line.contains("cutPoint")) {

						writer.write(parseLine(line) + "\n");

					} else {

						if (internal && line.contains("</cutPoint")) {

							internal = false;

							cleanUpBrackets(writer);

							contextCounter = 0;

							iCounter = 0;
						}
					}

				} else {

					break;
				}
			}

		} finally {

			writer.close();
		}

		popArrayList();
	}

	private static void cleanUpBrackets(BufferedWriter writer) throws IOException {

		for (int i = 1; i < contextCounter; i++) {

			writer.write("}");

			popArrayList();
		}

		writer.write("\n");
	}

	private static void pushArrayList() {

		booleanValueList.add(0, new ArrayList<>());
		doubleValueList.add(0, new ArrayList<>());
		objectValueList.add(0, new ArrayList<>());
	}

	private static void popArrayList() {

		/*
		 * outputList(booleanList); outputList(doubleList); outputList(objectList);
		 */

		booleanCurrentIndexList = trimIndexList(booleanValueList, "b");
		doubleCurrentIndexList = trimIndexList(doubleValueList, "d");
		objectCurrentIndexList = trimIndexList(objectValueList, "o");
	}

	private static ArrayList<Integer> trimIndexList(ArrayList<ArrayList<String>> valueList, String string) {

		int newMaxIndex;

		valueList.remove(0);

		switch (string) {
		case "b":

			newMaxIndex = size(valueList);

			if (newMaxIndex != 0) {
				booleanIndex %= newMaxIndex;
			}

			return trimList(booleanAllIndexList, newMaxIndex);

		case "d":

			newMaxIndex = size(valueList);

			if (newMaxIndex != 0) {
				doubleIndex %= newMaxIndex;
			}

			return trimList(doubleAllIndexList, newMaxIndex);

		case "o":

			newMaxIndex = size(valueList);

			if (newMaxIndex != 0) {
				objectIndex %= newMaxIndex;
			}

			return trimList(objectAllIndexList, newMaxIndex);

		default:
			throw new RuntimeException("invalid sequence");
		}
	}

	private static ArrayList<Integer> trimList(ArrayList<Integer> allIndexList, int newMaxIndex) {

		ArrayList<Integer> result = new ArrayList<>();

		for (Integer integer : allIndexList) {

			if (integer.intValue() < newMaxIndex) {

				result.add(integer);
			}
		}

		return result;
	}

	private static String parseLine(String line) {

		parseContexts(line);

		String result = replaceVariables(line);

		result = replaceForVars(result);

		parseDeclarations(line);

		return result;
	}

	private static void parseDeclarations(String line) {

		internal |= line.lastIndexOf("m") != -1 || line.lastIndexOf("empty(){") != -1
				|| line.lastIndexOf("own(){") != -1 || line.lastIndexOf("other(){") != -1;

		if (line.contains("boolean") && line.lastIndexOf("boolean") > line.lastIndexOf("m")
				&& !line.contains("Failed")) {

			pushBooleans(line);
		}
		if (line.contains("double") && line.lastIndexOf("double") > line.lastIndexOf("m")) {

			pushDoubles(line);
		}
		if (line.contains("Thought ") && line.lastIndexOf("Thought") > line.lastIndexOf("m")
				&& line.lastIndexOf("Instance") == -1) {

			pushObjects(line);
		}
	}

	private static void parseContexts(String line) {

		if (line.contains("}")) {
			popArrayList();

			if (internal) {
				contextCounter--;
			}
		}
		if (line.contains("{")) {
			pushArrayList();

			if (internal) {
				contextCounter++;
			}

		}
	}

	private static String replaceVariables(String line) {

		if (line.contains("k")) {

			return replaced(line);
		}

		return line;
	}

	private static String replaceForVars(String result) {

		if (result.contains("for")) {

			String i = "i" + iCounter++;

			result = result.replace("j", i);
		}

		return result;
	}

	private static String replaced(String line) {

		String temp = replace(line, "bk", booleanValueList, false);
		temp = replace(temp, "dk", doubleValueList, false);
		temp = replace(temp, "ok", objectValueList, true);

		if (temp.contains("on")) {
			temp = temp.replace("on", nextOutputNode());
		}

		return temp;
	}

	private static String replace(String line, String replacee, ArrayList<ArrayList<String>> valueList,
			boolean isObject) {

		boolean actualObject = line.indexOf(replacee) != -1, prefixed = false;

		String prefix = "";

		while (line.indexOf(replacee) != -1) {

			String replacer = getNextValue(replacee, valueList);

			int start = line.indexOf(replacee);
			int endReplacee = start + replacee.length();

			if (isObject && line.substring(endReplacee, endReplacee + 1).equals(".")) {
				prefix = "if(" + replacer + " != null){\n  ";
				prefixed = true;
			}

			line = line.substring(0, start) + replacer + line.substring(endReplacee, line.length());
		}

		if (isObject && actualObject && prefixed) {

			line = prefix + line + "\n}";
		}

		return line;
	}

	private static String getNextValue(String replacee, ArrayList<ArrayList<String>> valueList) {

		String result;

		switch (replacee) {
		case "bk":

			result = getNextValue(valueList, booleanIndex);

			booleanIndex++;
			booleanIndex %= size(valueList);

			return result;

		case "dk":

			result = getNextValue(valueList, doubleIndex);

			doubleIndex++;
			doubleIndex %= size(valueList);

			return result;

		case "ok":

			result = getNextValue(valueList, objectIndex);

			objectIndex++;
			objectIndex %= size(valueList);

			return result;

		default:
			throw new RuntimeException("invalid sequence");
		}
	}

	private static String nextOutputNode() {

		String result = outputNodesSeq[outputNodeCounter];

		outputNodeCounter++;

		if (outputNodeCounter == outputNodesSeq.length) {

			outputNodeCounter = 0;
			outputNodePass++;
		}

		return result;
	}

	private static int size(ArrayList<ArrayList<String>> valueList) {

		int counter = 0;

		for (ArrayList<String> list : valueList) {
			counter += list.size();
		}

		return counter;
	}

	private static String getNextValue(ArrayList<ArrayList<String>> valueList, int index) {

		int counter = 0;

		for (ArrayList<String> list : valueList) {

			for (String value : list) {

				if (counter++ == index) {

					return value;
				}
			}
		}

		throw new RuntimeException(
				"couldn't get a next value, the framework is probably broken :( (this is very bad news)");
	}

	private static void pushBooleans(String line) {

		parseDeclaration(line, "boolean", booleanValueList);
	}

	private static void pushDoubles(String line) {

		parseDeclaration(line, "double", doubleValueList);
	}

	private static void pushObjects(String line) {

		parseDeclaration(line, "Thought", objectValueList);
	}

	private static void parseDeclaration(String line, String string, ArrayList<ArrayList<String>> list) {

		int currentIndex = line.indexOf(string);

		if (currentIndex == 0) {

			currentIndex = line.indexOf(string, 1);
		}

		if (currentIndex == -1) {

			return;
		}

		do {

			int nextIndex = line.indexOf(" =", currentIndex + string.length() + 1);

			if (nextIndex == -1) {

				nextIndex = line.indexOf(",", currentIndex + string.length() + 1);
			}

			if (nextIndex == -1) {

				nextIndex = line.indexOf(")", currentIndex + string.length() + 1);
			}

			String result = line.substring(currentIndex + string.length() + 1, nextIndex);

			if (result.contains("(Thought")) {

				currentIndex += "(Thought".length() + 2;
				continue;
			}

			if (result.contains("(double")) {

				currentIndex += "(double".length() + 2;
				continue;
			}

			if (result.contains("(boolean")) {

				currentIndex += "(boolean".length() + 2;
				continue;
			}

			list.get(0).add(result);

			growIndexes(string);

			currentIndex += string.length() + 1;

			currentIndex = line.indexOf(string, currentIndex);

			if (line.contains("new")) {

				break;
			}

		} while (currentIndex != -1);
	}

	private static void growIndexes(String string) {

		switch (string) {
		case "boolean":

			booleanCurrentIndexList = growIndex(booleanAllIndexList, booleanCurrentIndexList);

			break;

		case "double":

			doubleCurrentIndexList = growIndex(doubleAllIndexList, doubleCurrentIndexList);

			break;

		case "Thought":

			objectCurrentIndexList = growIndex(objectAllIndexList, objectCurrentIndexList);

			break;

		default:
			throw new RuntimeException("invalid sequence");
		}
	}

	private static ArrayList<Integer> growIndex(ArrayList<Integer> allIndexList, ArrayList<Integer> currentIndexList) {

		ArrayList<Integer> result = new ArrayList<Integer>();

		int newIndex = currentIndexList.size() + 1;

		for (Integer integer : allIndexList) {

			if (integer.intValue() < newIndex) {

				result.add(integer);
			}
		}

		return result;
	}

	private static void outputList(ArrayList<ArrayList<String>> list) {

		for (ArrayList<String> element : list) {

			for (String variable : element) {

				System.out.print(variable + ", ");
			}
			System.out.println();
		}
	}
}
