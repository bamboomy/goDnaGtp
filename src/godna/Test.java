package godna;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public Test() {
	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(5);
		list.add(3);
		list.add(8);
		list.add(1);
		list.add(9);
		list.add(7);
		list.add(2);
		list.add(10);

		list = shuffle(list);

		for (Integer integer : list) {
			System.out.print(integer + ", ");
		}
		System.out.println();
	}

	private static List<Integer> shuffle(List<Integer> sbList) {

		List<Integer> result = new ArrayList<>();

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
