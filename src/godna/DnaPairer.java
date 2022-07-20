package godna;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;

public class DnaPairer {

	public static final int NB_OF_CROSS_OVERS = 40;

	private final static Logger logger = Logger.getLogger(DnaPairer.class);

	public static void main(String[] args) {

		String first, second, childOne, childTwo;

		if (args.length != 4) {

			throw new RuntimeException("I need two input files and two output files!");

		} else {

			first = args[0];
			second = args[1];
			childOne = args[2];
			childTwo = args[3];
		}

		logger.debug("going to create: " + childOne + " and " + childTwo + " from " + first + " and " + second);

		try {

			BufferedWriter writer = new BufferedWriter(new FileWriter(childOne));

			pair(first, second, writer);

			writer.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {

			BufferedWriter writer = new BufferedWriter(new FileWriter(childTwo));

			pair(second, first, writer);

			writer.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void pair(String first, String second, BufferedWriter writer) {

		int firstCutpoints = countCutpoints(first);
		int secondCutpoints = countCutpoints(second);

		if (firstCutpoints != secondCutpoints) {

			throw new RuntimeException("cutpoints count doesn't match :(");
		}

		System.out.println("cutpointz match :) -> " + firstCutpoints);
		logger.debug("cutpointz match :) -> " + firstCutpoints);

		int[] cutpointsBase = createCutpointBase(firstCutpoints);

		int[][] cutpointsFirst = createFullCutpoints(cutpointsBase, first);
		int[][] cutpointsSecond = createFullCutpoints(cutpointsBase, second, cutpointsFirst);

		mingle(first, second, cutpointsFirst, cutpointsSecond, writer);
	}

	static int countCutpoints(String first) {

		int counter = 0;

		try {
			File file = new File(first); // creates a new file instance
			FileReader fr;
			fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr); // creates a buffering character input stream

			String line;

			while ((line = br.readLine()) != null) {

				if (line.contains("<cutPoint")) {
					counter++;
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return counter;
	}

	private static int[] createCutpointBase(int firstCutpoints) {

		int[] cutpointsBase = new int[NB_OF_CROSS_OVERS];

		for (int i = 0; i < NB_OF_CROSS_OVERS; i++) {

			cutpointsBase[i] = -1;
		}

		for (int i = 0; i < NB_OF_CROSS_OVERS; i++) {

			boolean same = true;

			while (same) {

				same = false;

				cutpointsBase[i] = (int) (Math.random() * firstCutpoints);

				for (int j = 0; j < i; j++) {

					same |= cutpointsBase[i] == cutpointsBase[j];
				}
			}
		}

		Arrays.sort(cutpointsBase);

		return cutpointsBase;
	}

	private static int[][] createFullCutpoints(int[] cutpointsBase, String filename) {

		System.out.println("---");
		logger.debug("---");

		int[][] result = new int[NB_OF_CROSS_OVERS][2];

		try {
			File file = new File(filename); // creates a new file instance
			FileReader fr;
			fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr); // creates a buffering character input stream

			String line;

			int cutpointMinorCounter = 0;

			boolean counting = false;

			int cutpointCounter = 0;

			while ((line = br.readLine()) != null) {

				if (line.contains("<cutPoint" + cutpointsBase[cutpointCounter])) {
					counting = true;
				}

				if (counting) {
					cutpointMinorCounter++;
				}

				if (line.contains("</cutPoint" + cutpointsBase[cutpointCounter])) {
					counting = false;

					int cutpointMinor = (int) (Math.random() * (cutpointMinorCounter - 10)) + 5;

					logger.debug(cutpointsBase[cutpointCounter] + ":" + cutpointMinorCounter + ", " + cutpointMinor);

					result[cutpointCounter][0] = cutpointsBase[cutpointCounter];
					result[cutpointCounter][1] = cutpointMinor;

					cutpointCounter++;
					counting = false;
					cutpointMinorCounter = 0;

					if (cutpointCounter == NB_OF_CROSS_OVERS) {
						break;
					}
				}
			}

			br.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("-----");

		return result;
	}

	private static int[][] createFullCutpoints(int[] cutpointsBase, String filename, int[][] cutpointsFirst) {

		System.out.println("---");

		int[][] result = new int[NB_OF_CROSS_OVERS][2];

		try {
			File file = new File(filename); // creates a new file instance
			FileReader fr;
			fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr); // creates a buffering character input stream

			String line;

			int cutpointMinorCounter = 0;

			boolean counting = false;

			int cutpointCounter = 0;

			while ((line = br.readLine()) != null) {

				if (line.contains("<cutPoint" + cutpointsBase[cutpointCounter])) {
					counting = true;
				}

				if (counting) {
					cutpointMinorCounter++;
				}

				if (line.contains("</cutPoint" + cutpointsBase[cutpointCounter])) {
					counting = false;

					int cutpointMinor = (int) (Math.random() * (cutpointMinorCounter - 10)) + 5;

					logger.debug(cutpointsBase[cutpointCounter] + ":" + cutpointMinorCounter + ", " + cutpointMinor);

					result[cutpointCounter][0] = cutpointsBase[cutpointCounter];
					result[cutpointCounter][1] = cutpointMinor;

					cutpointCounter++;
					counting = false;
					cutpointMinorCounter = 0;

					if (cutpointCounter == NB_OF_CROSS_OVERS) {
						break;
					}
				}
			}

			br.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("-----");

		return result;
	}

	private static void mingle(String first, String second, int[][] cutpointsFirst, int[][] cutpointsSecond,
			BufferedWriter writer) {

		try {
			File file = new File(first); // creates a new file instance
			FileReader fr;
			fr = new FileReader(file);
			BufferedReader br1 = new BufferedReader(fr); // creates a buffering character input stream

			file = new File(second); // creates a new file instance
			fr = new FileReader(file);
			BufferedReader br2 = new BufferedReader(fr); // creates a buffering character input stream

			String line;

			int cutpointCounter = 0;

			BufferedReader currentBufferedReader = br1, otherBufferedReader = br2;

			int[][] nextBorder = cutpointsFirst;
			int[][] currentNextBorder = nextBorder;
			int[][] otherNextBorder = cutpointsSecond;

			System.out.println("---");

			StringBuilder dirty = new StringBuilder();
			StringBuilder otherBuffer = new StringBuilder();
			boolean cutting = false;

			while ((line = currentBufferedReader.readLine()) != null) {

				// writer.write(line + "\n");

				if (cutting) {
					dirty.append(line + "\n");
				} else {
					otherBuffer.append(line + "\n");
				}

				if (cutpointCounter < NB_OF_CROSS_OVERS
						&& line.contains("<cutPoint" + nextBorder[cutpointCounter][0])) {

					System.out.println("nextBorder[cutpointCounter[0]" + nextBorder[cutpointCounter][0]);
					logger.debug("nextBorder[cutpointCounter[1]" + nextBorder[cutpointCounter][1]);

					cutting = true;

					for (int i = 0; i < nextBorder[cutpointCounter][1]; i++) {

						if ((line = currentBufferedReader.readLine()) == null) {

							throw new RuntimeException("something's off :/ -> nextBorder");
						}

						// writer.write(line + "\n");
						if (cutting) {
							dirty.append(line + "\n");
						} else {
							otherBuffer.append(line + "\n");
						}
					}

					BufferedReader tempBr = otherBufferedReader;
					otherBufferedReader = currentBufferedReader;
					currentBufferedReader = tempBr;

					nextBorder = otherNextBorder;
					int[][] temp = currentNextBorder;
					currentNextBorder = otherNextBorder;
					otherNextBorder = temp;

					while ((line = currentBufferedReader.readLine()) != null
							&& !line.contains("<cutPoint" + nextBorder[cutpointCounter][0])) {

						// skippin :)
					}

					System.out.println();

					System.out.println("-" + currentNextBorder[cutpointCounter][1]);
					logger.debug("-" + currentNextBorder[cutpointCounter][1]);

					for (int i = 0; i < currentNextBorder[cutpointCounter][1]; i++) {

						// still skippin...

						if ((line = currentBufferedReader.readLine()) == null) {

							throw new RuntimeException("something's off :/ -> otherNextBorder");
						}
					}

					cutpointCounter++;
				}

				if (cutpointCounter > 0 && cutpointCounter - 1 < NB_OF_CROSS_OVERS
						&& line.contains("</cutPoint" + nextBorder[cutpointCounter - 1][0])) {

					cutting = false;

					writer.write(otherBuffer.toString());
					writer.write(clean(dirty).toString());

					otherBuffer = new StringBuilder();
					dirty = new StringBuilder();
				}
			}

			writer.write(otherBuffer.toString());

			br1.close();

		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	private static StringBuilder clean(StringBuilder dirty) throws IOException {

		StringBuilder clean = new StringBuilder();

		Set<String> booleanSet = new HashSet<>();
		Set<String> doubleSet = new HashSet<>();
		Set<String> objectSet = new HashSet<>();

		System.out.println("cleaning");
		logger.debug("cleaning");

		String[] lines = dirty.toString().split("\\n");
		for (String line : lines) {

			if (line.contains("boolean")) {

				clean.append(checkLine(line, booleanSet, "boolean "));

			} else if (line.contains("double")) {

				clean.append(checkLine(line, doubleSet, "double "));

			} else if (line.contains("Thought ")) {

				clean.append(checkLine(line, objectSet, "Thought "));

			} else {

				clean.append(line);
			}
		}

		return clean;
	}

	private static String checkLine(String line, Set<String> variableSet, String delimiter) {

		String before = line.split(" =")[0];

		System.out.println(before);
		logger.debug(before);

		if (!before.contains(delimiter)) {

			return line;
		}

		String[] parts = before.split(delimiter);

		if (parts.length < 2 || variableSet.add(parts[1])) {

			return line;

		} else {

			System.out.println("skipped: " + line);
			logger.debug("skipped: " + line);

			return "";
		}
	}
}
