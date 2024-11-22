package Main;
import Main.Days.*;
import Main.Days.DayOne.SolverOne;

public class Main {
	
	public Main(Solver _solver) {
		this.visite(_solver);
	}
	
	private void visite(Solver solver) {
		System.out.println(solver.solve());
	}
	
	public static void main(String[] args) {
		new Main(new SolverOne());
	}
	
	
	
}
