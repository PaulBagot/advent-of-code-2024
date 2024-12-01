package Main.Days.DayOne;

import java.util.ArrayList;

import java.io.*;
import Main.Days.Solver;

public class SolverOne extends Solver {

	private ArrayList<Integer> list1;
	private ArrayList<Integer> list2;
	
	public SolverOne() {
		super(inputPath + "1");
		list1 = new ArrayList<>();
		list2 = new ArrayList<>();
		readFile();
	}

	private void parseInput() {
		String readLine = "";
	}
	
	private void readFile() {
		try (BufferedReader reader = new BufferedReader(new FileReader(new File(input)))) {
			String line;
			while((line = reader.readLine()) != null) {
				String[] args = line.trim().split("\s+");
				list1.add(Integer.parseInt(args[0]));
				list2.add(Integer.parseInt(args[1]));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	private ArrayList<Integer> sortArray(ArrayList<Integer> listOrigine) {
		ArrayList<Integer> list = (ArrayList<Integer>) listOrigine.clone();
		for(int i = 0; i < list.size() - 1; i++) {
			for(int j = i + 1; j < list.size(); j++) {
				if(list.get(i) > list.get(j)) {
					Integer temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		return list;
	}
	
	@Override
	public String solve() {
		ArrayList<Integer> list1_solve1 = sortArray(list1);
		ArrayList<Integer> list2_solve1 = sortArray(list2);
		Integer total = 0;
		while(list1_solve1.size() > 0) {
			total += Math.abs(list1_solve1.removeLast() - list2_solve1.removeLast());
		}
		return total + "";
	}
	
	private long howMany(Integer num) {
		int sum = 0;
		for(int i = 0; i < list2.size(); i++) {
			if(list2.get(i).equals(num))
				sum++;
		 }
		return num * sum;
	}
	
	@Override
	public String solve2() {
		long total = 0;
		while(list1.size() > 0) {
			Integer num = list1.removeLast();
			total += howMany(num);
		}
		return total + "";
	}
	

}
