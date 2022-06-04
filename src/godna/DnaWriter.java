package godna;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import genetic.CountDownExc;

public class DnaWriter {

	private static final int NB_OF_THOUGHTS = 20, MIN_LINEZ = 10, MAX_LINEZ = 30;
	static final int BOARDSIZE = 9;

	private static final String EMPTY = "", BOOLEANS = "boolean ab1, boolean ab2, boolean ab3, boolean ab4";
	private static final String DOUBLES = "double ad1, double ad2, double ad3, double ad4";
	private static final String OBJECTS = "Thought ao1, Thought ao2, Thought ao3, Thought ao4";

	private static final String[] ARGUMENTS = { EMPTY, BOOLEANS, DOUBLES, DOUBLES + ", " + BOOLEANS, OBJECTS,
			OBJECTS + ", " + DOUBLES, OBJECTS + ", " + BOOLEANS, OBJECTS + ", " + DOUBLES + ", " + BOOLEANS };

	private static ArrayList<Integer> booleanSequence, doubleSequence, objectSequence, argumentsSequence;
	private static ArrayList<String> booleanValues = new ArrayList<>();
	private static ArrayList<String> doubleValues = new ArrayList<>();
	private static ArrayList<String> objectValues = new ArrayList<>();
	private static ArrayList<Integer> booleanWorkSequence = new ArrayList<>();
	private static ArrayList<Integer> doubleWorkSequence = new ArrayList<>();
	private static ArrayList<Integer> objectWorkSequence = new ArrayList<>();
	private static ArrayList<Integer> booleanStaticSequence = new ArrayList<>();
	private static ArrayList<Integer> doubleStaticSequence = new ArrayList<>();
	private static ArrayList<Integer> objectStaticSequence = new ArrayList<>();

	private static int booleanWorkIndex = 0, doubleWorkIndex = 0, objectWorkIndex = 0;

	private static int lineCounter = 0;

	private static int localIndex = 0;

	private static int argumentIndex = 0;

	private static int cutPointCounter = 0;

	private static ArrayList<String> branchContexts = new ArrayList<>();

	private static final String FOR = "for", IF = "if", ELSE = "else";

	public DnaWriter() {
	}

	public static void main(String[] args) {

		String test;

		if (args.length == 0) {

			test = "test";

		} else {

			test = args[0];
		}

		try {

			BufferedWriter writer = new BufferedWriter(new FileWriter(test));

			writeDna(writer);

			writer.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void writeDna(BufferedWriter writer) throws IOException {

		writeSequences(writer);

		writeInput(writer);

		writeOutput(writer);

		for (int i = 0; i < NB_OF_THOUGHTS; i++) {
			writeThought(i, writer);
		}
	}

	private static void writeSequences(BufferedWriter writer) throws IOException {

		writeBooleanSequence(writer);
		writeDoubleSequence(writer);
		writeObjectSequence(writer);
		writeArgumentsSequence(writer);
	}

	private static void writeBooleanSequence(BufferedWriter writer) throws IOException {

		writeSequence("b", writer);
	}

	private static void writeDoubleSequence(BufferedWriter writer) throws IOException {

		writeSequence("d", writer);
	}

	private static void writeObjectSequence(BufferedWriter writer) throws IOException {

		writeSequence("o", writer);
	}

	private static void writeArgumentsSequence(BufferedWriter writer) throws IOException {

		writeSequence("arg", writer);
	}

	private static void writeSequence(String string, BufferedWriter writer) throws IOException {

		writer.write(string + ":");

		ArrayList<Integer> ordered = new ArrayList<>();

		int max = 30;

		ArrayList<Integer> result = new ArrayList<>();

		if (string.equals("arg")) {

			max = ARGUMENTS.length;

			for (int i = 0; i < max; i++) {

				ordered.add(i);
			}

			for (int i = 0; i < max; i++) {

				int index = (int) (Math.random() * ordered.size());

				result.add(ordered.remove(index));
			}

		} else {

			for (int i = 0; i < max; i++) {

				ordered.add(i);

				int index = (int) (Math.random() * ordered.size());

				result.add(ordered.get(index));
			}
		}

		for (int i = 0; i < max; i++) {
			writer.write(result.get(i) + ",");
		}

		writer.write("\n");

		switch (string) {
		case "b":

			booleanSequence = result;

			break;

		case "d":

			doubleSequence = result;

			break;

		case "o":

			objectSequence = result;

			break;

		case "arg":

			argumentsSequence = result;

			break;

		default:
			throw new RuntimeException("no default sequence!!!");
		}
	}

	private static void writeInput(BufferedWriter writer) throws IOException {

		writer.write("public class Input {\n");

		writeInputFields(writer);

		writeInputMethod(writer);

		writer.write("}\n");

		writer.write("<endClass/>\n");
	}

	private static void writeOutput(BufferedWriter writer) throws IOException {

		writer.write("public class Output {\n");

		writeOutputFields(writer);

		writeOutputMethods(writer);

		writer.write("}\n");

		writer.write("<endClass/>\n");
	}

	private static void writeInputFields(BufferedWriter writer) throws IOException {

		writer.write("Thought[][] thoughts = new Thought[" + BOARDSIZE + "][" + BOARDSIZE + "];\n");

		writer.write("{\n");

		for (int i = 0; i < BOARDSIZE; i++) {
			for (int j = 0; j < BOARDSIZE; j++) {

				int thoughtIndexX = (int) (NB_OF_THOUGHTS * Math.random());
				int thoughtIndexY = (int) (NB_OF_THOUGHTS * Math.random());
				int thoughtIndexZ = (int) (NB_OF_THOUGHTS * Math.random());

				writer.write("thoughts[" + i + "][" + j + "] = new Thought" + thoughtIndexX + "(new Thought"
						+ thoughtIndexY + "(), new Thought" + thoughtIndexZ + "(), null, null);\n");
			}
		}

		writer.write("}\n");
	}

	private static void writeInputMethod(BufferedWriter writer) throws IOException {

		writer.write("public void accept(int x, int y, String color){\n");
		writer.write("try {\n");
		writer.write("thoughts[x][y].accept(color);\n");
		writer.write("} catch (CountDownExc e) { \n");
		writer.write("// dan niet... \n");
		writer.write("} catch (StackOverflowExc e) {\n" + "Thought.STACK_COUNTER = 100;\n");
		writer.write("}\n");
		writer.write("}\n");

	}

	private static void writeOutputFields(BufferedWriter writer) throws IOException {

		writer.write("public static double[][] points = new double[" + BOARDSIZE + "][" + BOARDSIZE + "];\n");

	}

	private static void writeOutputMethods(BufferedWriter writer) throws IOException {

		writeClear(writer);
	}

	private static void writeClear(BufferedWriter writer) throws IOException {

		writer.write("public static void clear(){\n");

		for (int i = 0; i < BOARDSIZE; i++) {
			for (int j = 0; j < BOARDSIZE; j++) {
				writer.write("points[" + i + "][" + j + "] = 0.0;\n");
			}
		}

		writer.write("}\n");
	}

	private static void writeThought(int i, BufferedWriter writer) throws IOException {

		String className = "Thought" + i;

		writer.write("class " + className + " extends Thought{\n");

		writer.write("private static ArrayList<" + className + "> instances = new ArrayList<>();\n");
		writer.write("private static int instanceCounter = 0;\n");

		writeFields(writer);

		writeMethods(writer, true, className);

		writer.write("}\n");

		writer.write("<endClass/>\n");
	}

	private static void writeFields(BufferedWriter writer) throws IOException {

		for (int i = 0; i < 2; i++) {
			writeBoolean(writer, i);
		}

		for (int i = 0; i < 2; i++) {
			writeDouble(writer, i);
		}
		
		writer.write("private Thought fo0 = null;\n");
		writer.write("private Thought fo1 = null;\n");

		booleanValues = new ArrayList<>();
		doubleValues = new ArrayList<>();
		objectValues = new ArrayList<>();

		booleanWorkSequence = new ArrayList<>();
		doubleWorkSequence = new ArrayList<>();
		objectWorkSequence = new ArrayList<>();

		booleanWorkIndex = 0;
		doubleWorkIndex = 0;
		objectWorkIndex = 0;
	}

	private static void writeBoolean(BufferedWriter writer, int index) throws IOException {

		String value = "true";

		if ((int) (Math.random() * 2) < 1) {

			value = "false";
		}

		writer.write("private boolean fb" + index + " = " + value + ";\n");

		pushBoolean("fb" + index);
	}

	private static void writeDouble(BufferedWriter writer, int index) throws IOException {

		writer.write("private double fd" + index + " = " + (Math.random() * 1001) + ";\n");

		pushDouble("fd" + index);
	}

	private static void pushBoolean(String string) {

		booleanValues.add(string);

		booleanWorkSequence = updateSequence(booleanSequence, booleanValues);
	}

	private static void pushDouble(String string) {

		doubleValues.add(string);

		doubleWorkSequence = updateSequence(doubleSequence, doubleValues);
	}

	private static void pushObject(String string) {

		objectValues.add(string);

		objectWorkSequence = updateSequence(objectSequence, objectValues);
	}

	private static ArrayList<Integer> updateSequence(ArrayList<Integer> indexSeq, ArrayList<String> valSeq) {

		ArrayList<Integer> result = new ArrayList<>();

		int max = valSeq.size();

		int counter = 0;

		for (int i = 0; i < max;) {

			int value = indexSeq.get(counter++);

			if (value < max) {

				result.add(value);

				i++;
			}
		}

		return result;
	}

	private static String getValues(String signature) {

		String result = "";

		String[] arguments = signature.split(", ");

		for (String argument : arguments) {

			String type = argument.split(" ")[0];

			switch (type) {

			case "boolean":

				result += getNextBoolean() + ", ";

				break;

			case "double":

				result += getNextDouble() + ", ";

				break;

			case "Thought":

				result += getNextObject() + ", ";

				break;

			default:
				break;
			}
		}

		if (result.lastIndexOf(",") != -1) {
			result = result.substring(0, result.lastIndexOf(","));
		}

		return result;
	}

	private static String getNextBoolean() {

		if (booleanWorkSequence.size() == 0) {

			return "false";
		}

		String result = booleanValues.get(booleanWorkSequence.get(booleanWorkIndex));

		booleanWorkIndex++;

		booleanWorkIndex %= booleanWorkSequence.size();

		return result;
	}

	private static String getNextDouble() {

		if (doubleWorkSequence.size() == 0) {

			return "0.0";
		}

		String result = doubleValues.get(doubleWorkSequence.get(doubleWorkIndex));

		doubleWorkIndex++;

		doubleWorkIndex %= doubleWorkSequence.size();

		return result;
	}

	private static String getNextObject() {

		if (objectWorkSequence.size() == 0) {

			return "null";
		}

		String result = objectValues.get(objectWorkSequence.get(objectWorkIndex));

		objectWorkIndex++;

		objectWorkIndex %= objectWorkSequence.size();

		return result;
	}

	private static void writeMethods(BufferedWriter writer, boolean isThought, String className) throws IOException {

		if (isThought) {
			writeThougthConstructors(writer, className);
		}

		if (isThought) {
			writeGetAnInstances(writer, className);
		}

		boolean hasMethodCall = false;

		for (String arguments : ARGUMENTS) {
			hasMethodCall = writeMethod("void m1", arguments, writer, true);
			writeEnd(writer, "", hasMethodCall);
		}

		for (String arguments : ARGUMENTS) {
			hasMethodCall = writeMethod("boolean m2", arguments, writer, true);
			writeEnd(writer, "bk", hasMethodCall);
		}

		for (String arguments : ARGUMENTS) {
			hasMethodCall = writeMethod("double m3", arguments, writer, true);
			writeEnd(writer, "dk", hasMethodCall);
		}

		for (String arguments : ARGUMENTS) {
			hasMethodCall = writeMethod("Thought m4", arguments, writer, true);
			writeEnd(writer, "ok", hasMethodCall);
		}

		writeAccept(writer);

		hasMethodCall = writeMethod("void empty", EMPTY, writer, false);
		writeEnd(writer, "", hasMethodCall);

		hasMethodCall = writeMethod("void own", EMPTY, writer, false);
		writeEnd(writer, "", hasMethodCall);

		hasMethodCall = writeMethod("void other", EMPTY, writer, false);
		writeEnd(writer, "", hasMethodCall);
	}

	private static void writeThougthConstructors(BufferedWriter writer, String className) throws IOException {

		for (int i = 0; i < ARGUMENTS.length; i++) {
			writeConstructor(ARGUMENTS[i], writer, className);
		}
	}

	private static void writeGetAnInstances(BufferedWriter writer, String className) throws IOException {

		for (int i = 0; i < ARGUMENTS.length; i++) {
			writeGetAnInstance(ARGUMENTS[i], writer, className);
		}
	}

	private static void writeConstructor(String args, BufferedWriter writer, String className) throws IOException {

		writer.write(className + " (" + args + "){" + "\n");

		writer.write(decOrExec());

		if (args.contains("boolean")) {
			for (int i = 0; i < 2; i++) {
				writer.write("fb" + i + " = ab" + (i + 1) + "; \n");
			}
		}
		if (args.contains("double")) {
			for (int i = 0; i < 2; i++) {
				writer.write("fd" + i + " = ad" + (i + 1) + "; \n");
			}
		}
		if (args.contains("Thought")) {
			for (int i = 0; i < 2; i++) {
				writer.write("fo" + i + " = ao" + (i + 1) + "; \n");
			}
		}
		writer.write(inc());
		writer.write("}\n");
	}

	private static void writeGetAnInstance(String args, BufferedWriter writer, String className) throws IOException {

		writer.write("public static " + className + " getInstance(" + args + "){" + "\n");

		writer.write("if (instances.size() >= 10) { \n");

		writer.write("instanceCounter++; \n");
		writer.write("instanceCounter%=10; \n");
		writer.write("return instances.get(instanceCounter); \n");

		writer.write("} else { \n");

		args = args.replace("boolean", "");
		args = args.replace("double", "");
		args = args.replace("Thought", "");

		writer.write(className + " instance = new " + className + " (" + args + "); \n");
		writer.write("instances.add(instance); \n");
		writer.write("return instance; \n");

		writer.write("} \n");

		writer.write("}\n");
	}

	private static void writeAccept(BufferedWriter writer) throws IOException {

		writer.write("void accept(String color) throws CountDownExc {\n");

		writer.write("switch (color) {\n");
		writer.write("case \"e\":\n");
		writer.write("empty();\n");
		writer.write("break;\n");

		writer.write("case \"own\":\n");
		writer.write("own();\n");
		writer.write("break;\n");

		writer.write("case \"other\":\n");
		writer.write("other();\n");
		writer.write("break;\n");

		writer.write("default:\n");
		writer.write("throw new RuntimeException(\"Illegal color!!!\");\n");
		writer.write("}\n");
		writer.write("}\n");
	}

	private static boolean writeMethod(String type, String args, BufferedWriter writer, boolean branch)
			throws IOException {

		localIndex = 0;

		branchContexts = new ArrayList<>();

		writer.write(type + "(" + args + ") throws CountDownExc {\n");

		writer.write(decOrExec());

		int nbOfLinez = getNbOfLinez();

		writer.write("try {\n");
		
		writer.write("if (false) { throw new CountDownExc(-1); }\n");

		writer.write("<cutPoint" + cutPointCounter + ">\n");

		boolean hasMethodCall = false;

		for (int i = 0; i < nbOfLinez; i++) {

			hasMethodCall |= writeLine(writer, branch);
		}

		writer.write("</cutPoint" + cutPointCounter++ + ">\n");

		writer.write(inc());

		return hasMethodCall;
	}

	private static void writeEnd(BufferedWriter writer, String returnType, boolean hasMethodCall) throws IOException {

		System.out.println(returnType);

		writeCatch(writer, returnType, hasMethodCall);
	}

	private static void writeCatch(BufferedWriter writer, String returnType, boolean hasMethodCall) throws IOException {

		if (!returnType.equals("")) {

			writer.write("return " + returnType + ";\n");

			writer.write("} catch (StackOverflowExc | NoClassDefFoundError e) { ");
			writer.write("throw new CountDownExc(50);\n");

			if (hasMethodCall) {

				writer.write("} catch (CountDownExc e) {\n");

				writer.write("if(!e.surfaced()) {\n");
				writer.write("e.dec();\n");
				writer.write("throw e;\n");
				writer.write("}\n");

				writer.write("return " + getDefaultValue(returnType) + ";\n");
			}

			writer.write("} \n");

		} else {

			writer.write("} catch (StackOverflowExc | NoClassDefFoundError e) { \n");
			writer.write("throw new CountDownExc(50);\n");

			if (hasMethodCall) {

				writer.write("} catch (CountDownExc e) {\n");

				writer.write("if(!e.surfaced()) {\n");
				writer.write("e.dec();\n");
				writer.write("throw e;\n");
				writer.write("}\n");
			}

			writer.write("} \n");
		}

		writer.write("}\n");
	}

	private static String getDefaultValue(String returnType) {

		switch (returnType) {

		case "bk":

			return "false";

		case "dk":

			return "0.0";

		case "ok":

			return "null";

		default:
			throw new RuntimeException("wrong returnType for catch");
		}
	}

	private static int getNbOfLinez() {
		return (int) ((Math.random() * (MAX_LINEZ - MIN_LINEZ)) + MIN_LINEZ);
	}

	private static boolean writeLine(BufferedWriter writer, boolean branch) throws IOException {

		boolean hasMethodCall = false;

		double rand = Math.random() * 220;

		for (int i = 0; i < 4; i++) {
			writer.write(" ");
		}
		for (int i = 0; i < branchContexts.size() * 4; i++) {
			writer.write(" ");
		}

		if (rand < 80) {

			hasMethodCall |= writeBoolean(writer);

		} else if (rand < 80 + 60) {

			hasMethodCall |= writeDouble(writer);

		} else if (rand < 80 + 60 + 60) {

			hasMethodCall |= writeObject(writer);

		} else {

			double rand2 = Math.random() * 2;

			if (rand2 > 1) {

				if (branch) {
					writeBranch(writer);
				}

			} else {

				writeOutputNode(writer);
			}
		}

		return hasMethodCall;
	}

	private static boolean writeBoolean(BufferedWriter writer) throws IOException {

		double rand = Math.random() * 8;

		if (rand < 1) {

			writer.write("boolean lb" + localIndex++ + " = false;\n");

		} else if (rand < 2) {

			writer.write("boolean lb" + localIndex++ + " = true;\n");

		} else if (rand < 3) {

			writer.write("bk = bk || bk;\n");

		} else if (rand < 4) {

			writer.write("bk = bk && bk;\n");

		} else if (rand < 5) {

			writer.write("bk = !bk;\n");

		} else if (rand < 6) {

			writer.write("bk = dk < dk;\n");

		} else if (rand < 7) {

			writer.write("bk = dk > dk;\n");

		} else {

			writer.write("bk = ok.m2(" + getArguments() + ");\n");

			return true;
		}

		return false;
	}

	private static boolean writeDouble(BufferedWriter writer) throws IOException {

		double rand = Math.random() * 5;

		if (rand < 1) {

			writer.write("double ld" + localIndex++ + " = " + (Math.random() * 1001) + ";\n");

		} else if (rand < 2) {

			writer.write("dk = dk + dk;\n");

		} else if (rand < 3) {

			writer.write("dk = dk - dk;\n");

		} else if (rand < 4) {

			writer.write("dk *= -1;\n");

		} else {

			writer.write("dk = ok.m3(" + getArguments() + ");\n");

			return true;
		}

		return false;
	}

	private static boolean writeObject(BufferedWriter writer) throws IOException {

		double rand = Math.random() * 4;

		if (rand < 1) {

			String className = "Thought" + (int) (Math.random() * NB_OF_THOUGHTS);

			writer.write("Thought lo" + localIndex++ + " = " + className + ".getInstance(" + getArguments() + ");\n");

		} else if (rand < 2) {

			int randMethod = (int) (Math.random() * 3) + 1;

			writer.write("ok.m" + randMethod + "(" + getArguments() + ");\n");

			return true;

		} else {

			writer.write("ok = ok.m4(" + getArguments() + ");\n");

			return true;
		}

		return false;
	}

	private static void writeBranch(BufferedWriter writer) throws IOException {

		double rand = Math.random() * 4;

		if (rand < 1) {

			writer.write("if (bk) {\n");

			branchContexts.add(0, IF);

		} else if (rand < 2) {

			if (branchContexts.size() > 0 && branchContexts.get(0).equals(FOR)) {

				writer.write("}\n");
				branchContexts.remove(0);

			} else if (branchContexts.size() > 0 && branchContexts.get(0).equals(IF)) {

				writer.write("} else {\n");
				branchContexts.remove(0);
				branchContexts.add(0, ELSE);
			}

		} else if (rand < 3) {

			if (branchContexts.size() > 0 && branchContexts.get(0).equals(IF)) {

				writer.write("} else if (bk) {\n");

			} else if (branchContexts.size() > 0 && branchContexts.get(0).equals(FOR)) {

				writer.write("}\n");
				branchContexts.remove(0);
			}

		} else {

			writer.write("for(int j=0; j<10; j++){\n");
			branchContexts.add(0, FOR);
		}
	}

	private static void writeOutputNode(BufferedWriter writer) throws IOException {

		double rand2 = Math.random() * 2;

		if (rand2 < 1) {

			writer.write("on += dk;\n");

		} else {

			writer.write("on -= dk;\n");
		}
	}

	private static String getArguments() {

		String rawArguments = ARGUMENTS[argumentsSequence.get(argumentIndex++)];

		argumentIndex %= argumentsSequence.size();

		return parseRawArguments(rawArguments);
	}

	private static String parseRawArguments(String rawArguments) {

		String result = "";

		String[] arguments = rawArguments.split(", ");

		for (String argument : arguments) {

			String type = argument.split(" ")[0];

			switch (type) {

			case "boolean":

				result += "bk, ";

				break;

			case "double":

				result += "dk, ";

				break;

			case "Thought":

				result += "ok, ";

				break;

			default:
				break;
			}
		}

		if (result.lastIndexOf(",") != -1) {
			result = result.substring(0, result.lastIndexOf(","));
		}

		return result;
	}

	private static String decOrExec() {

		StringBuffer sb = new StringBuffer("Thought.STACK_COUNTER--;\n");
		sb.append("if(Thought.STACK_COUNTER <=0){\n");
		sb.append("throw new StackOverflowExc();\n");
		sb.append("}\n");

		return sb.toString();
	}

	private static String inc() {
		return "Thought.STACK_COUNTER++;\n";
	}
}
