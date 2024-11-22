package Main.Days;

import Main.Main;

public abstract class Solver {

	public static final String inputPath = "./resources/input";
	private String input;
	
	public Solver(String input) {
		this.input = input;
	}
	
	public abstract String solve();
	
	public String getInput() {
		return input;
	}
	
}
