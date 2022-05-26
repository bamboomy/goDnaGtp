package godna;

public class Test {

	public Test() {
	}

	public static void main(String[] args) {

		String toParse = "Thought0 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4";

		int currentIndex = toParse.indexOf("double");

		do {

			System.out.println(toParse.substring(currentIndex + "double".length() + 1,
					toParse.indexOf(",", currentIndex + "double".length() + 1)));

			currentIndex = currentIndex + "double".length() + 1;

			currentIndex = toParse.indexOf("double", currentIndex);

		} while (currentIndex != -1);
	}

}
