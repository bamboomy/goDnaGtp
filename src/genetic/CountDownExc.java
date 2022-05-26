package genetic;

public class CountDownExc extends Exception {

	private int counter = 0;

	private CountDownExc() {

	}

	private CountDownExc(String message) {
		super(message);

	}

	private CountDownExc(Throwable cause) {
		super(cause);

	}

	private CountDownExc(String message, Throwable cause) {
		super(message, cause);

	}

	private CountDownExc(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public CountDownExc(int counter) {
		this.counter = counter;
	}

	void dec() {
		counter--;
	}

	boolean surfaced() {
		return counter <= 0;
	}
}
