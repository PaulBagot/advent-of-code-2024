package Main;
import Main.Days.*;
import Main.Days.DayOne.SolverOne;

public class Main {
	
	public Main(Solver _solver) {
		this.visite(_solver);
	}
	
	private void visite(Solver solver) {
		System.out.println("solve1 : " + solver.solve());
		System.out.println("solve2 : " + solver.solve2());
	}
	
	public static void main(String[] args) {
		new Main(new SolverOne());
	}
	
	
	
}
