package net.sf.gogui.tools.dummy;

import org.apache.log4j.Logger;

import genetic.Input;
import genetic.Output;
import net.sf.gogui.go.Board;
import net.sf.gogui.go.GoColor;
import net.sf.gogui.go.GoPoint;

public class Bridge {

	private final Input input = new Input();
	private final GoColor ownColor;
	private Board board;

	private boolean handicap = false;

	final static Logger logger = Logger.getLogger(Bridge.class);

	public Bridge(GoColor ownColor) {
		this.ownColor = ownColor;
	}

	public void read(Board board) {

		this.board = board;

		checkHandicap();

		Output.clear();
		
		output();

		for (int i = 0; i < board.getSize(); i++) {
			for (int j = 0; j < board.getSize(); j++) {

				input.accept(i, j, parseGoColor(board.getColor(GoPoint.get(i, j))));
			}
		}
	}

	private void checkHandicap() {

		if (!handicap) {

			board.play(GoColor.BLACK, GoPoint.get(2, 2));
			board.play(GoColor.BLACK, GoPoint.get(6, 2));
			board.play(GoColor.BLACK, GoPoint.get(2, 6));
			board.play(GoColor.BLACK, GoPoint.get(6, 6));
			board.play(GoColor.BLACK, GoPoint.get(4, 4));

			handicap = true;
		}
	}

	private String parseGoColor(GoColor color) {

		if (color.equals(ownColor)) {

			return "own";
		}

		if (color.equals(ownColor.otherColor())) {

			return "other";
		}

		return "e";
	}

	public GoPoint getPoint() {

		double maxAboveZero = 0.0;
		GoPoint result = null;

		checkHandicap();

		output();

		for (int i = 0; i < Output.points.length; i++) {
			for (int j = 0; j < Output.points.length; j++) {

				if (Output.points[i][j] > maxAboveZero) {

					GoPoint rulesCheck = GoPoint.get(i, j);

					if (board.getColor(rulesCheck).equals(GoColor.EMPTY) && !board.isKo(rulesCheck)
							&& !board.isSuicide(ownColor, rulesCheck)) {

						maxAboveZero = Output.points[i][j];
						result = rulesCheck;
					} else {

						logger.debug("empty?:" + board.getColor(rulesCheck).equals(GoColor.EMPTY) + ", ko:"
								+ board.isKo(rulesCheck) + ", suicide:" + board.isSuicide(ownColor, rulesCheck));
					}
				}
			}
		}

		board.play(ownColor, result);

		return result;
	}

	private void output() {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < Output.points.length; i++) {
			for (int j = 0; j < Output.points.length; j++) {
				sb.append(board.getColor(GoPoint.get(i, j)).getUppercaseLetter() + "|");
			}
			logger.debug(sb);
			sb = new StringBuilder();
		}

		logger.debug("----");
	}
}
