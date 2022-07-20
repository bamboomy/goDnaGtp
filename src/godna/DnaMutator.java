package godna;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;

public class DnaMutator {
	
	private final static Logger logger = Logger.getLogger(DnaMutator.class);
	
	private static final int MUTATIONZ = 10;

	public static void main(String[] args) {

		if (args.length != 2) {

			throw new RuntimeException("I need an from and to!");
		}

		String mutatee = args[0];
		String mutated = args[1];

		try {

			BufferedWriter writer = new BufferedWriter(new FileWriter(mutated));

			mutate(mutatee, writer);

			writer.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("that's it...");
	}

	private static void mutate(String mutatee, BufferedWriter writer) {

		int cutpointCount = DnaPairer.countCutpoints(mutatee);

		Set<Integer> mutatePoints = new HashSet<>();

		while (mutatePoints.size() < MUTATIONZ) {

			mutatePoints.add((int) (Math.random() * cutpointCount));
		}

		int[] mutateArray = mutatePoints.stream().mapToInt(Integer::intValue).peek(System.out::println)
				.peek(logger::debug).toArray();

		Arrays.sort(mutateArray);

		StringBuilder[] straight = getStringBuilders(mutatee, mutateArray);

		for (StringBuilder sb : straight) {

			System.out.println(sb.toString());
			logger.debug("\\/straight\\/");
			logger.debug(sb.toString());
			System.out.println("====");
		}

		copyAndWrite(mutatee, straight, mutateArray, writer);
	}

	private static StringBuilder[] getStringBuilders(String mutatee, int[] mutateArray) {

		System.out.println("---");

		StringBuilder[] result = new StringBuilder[MUTATIONZ];

		try {
			File file = new File(mutatee); // creates a new file instance
			FileReader fr;
			fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr); // creates a buffering character input stream

			String line;

			int cutpointCounter = 0;

			while ((line = br.readLine()) != null) {

				if (line.contains("<cutPoint" + mutateArray[cutpointCounter])) {

					result[cutpointCounter] = new StringBuilder();

					StringBuilder current = result[cutpointCounter];

					while ((line = br.readLine()) != null
							&& !line.contains("</cutPoint" + mutateArray[cutpointCounter])) {

						current.append(line + "\n");
					}

					cutpointCounter++;

					if (cutpointCounter >= MUTATIONZ) {
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

	private static void copyAndWrite(String mutatee, StringBuilder[] straight, int[] mutateArray,
			BufferedWriter writer) {

		System.out.println("---");
		logger.debug("\\/copy & right\\/");

		List<StringBuilder> sbList = Arrays.asList(straight);

		sbList = shuffle(sbList);

		try {
			File file = new File(mutatee); // creates a new file instance
			FileReader fr;
			fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr); // creates a buffering character input stream

			String line;

			int cutpointCounter = 0;

			while ((line = br.readLine()) != null) {

				writer.write(line + "\n");

				if (cutpointCounter != MUTATIONZ && line.contains("<cutPoint" + mutateArray[cutpointCounter])) {

					writer.write(sbList.get(cutpointCounter).toString());
					logger.debug("\\/sb\\/");
					logger.debug(sbList.get(cutpointCounter).toString());

					while ((line = br.readLine()) != null
							&& !line.contains("</cutPoint" + mutateArray[cutpointCounter])) {
					}

					writer.write(line + "\n");

					cutpointCounter++;
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

		System.out.println("====");
	}

	private static List<StringBuilder> shuffle(List<StringBuilder> sbList) {

		List<StringBuilder> result = new ArrayList<StringBuilder>();

		int randomIndex = (int) (Math.random() * sbList.size());

		List<Integer> choosenIndexes = new ArrayList<Integer>();

		while (randomIndex == 0) {
			randomIndex = (int) (Math.random() * sbList.size());
		}

		result.add(sbList.get(randomIndex));
		choosenIndexes.add(randomIndex);

		while (choosenIndexes.size() < sbList.size()) {

			randomIndex = (int) (Math.random() * sbList.size());

			while (choosenIndexes.contains(randomIndex)) {

				randomIndex = (int) (Math.random() * sbList.size());
			}
			
			result.add(sbList.get(randomIndex));
			choosenIndexes.add(randomIndex);
		}
		
		return result;
	}

}
