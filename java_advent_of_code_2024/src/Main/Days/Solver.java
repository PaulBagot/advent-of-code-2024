package Main.Days;

import Main.Main;

public abstract class Solver {

	public static final String inputPath = "./src/resources/input";
	protected String input;
	
	public Solver(String input) {
		this.input = input;
	}
	
	public abstract String solve();
	
	public abstract String solve2();
	
	public String getInput() {
		return input;
	}
	
}
