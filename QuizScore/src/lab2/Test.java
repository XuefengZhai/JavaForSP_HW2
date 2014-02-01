package lab2;
/*
 * Xuefeng Zhai
 * xzhai@cmu.edu
 * Class for test different cases
 */
public class Test {

	public static void main(String[] args) {
		
		System.out.println("Test case 1: 1 Students");
		CalculateScore test1 = new CalculateScore();
		test1.run(1, "src/data1.txt");
		
		System.out.println();

		System.out.println("Test case 2: 10 Students");
		CalculateScore test2 = new CalculateScore();
		test2.run(10, "src/data10.txt");
		
		System.out.println();

		System.out.println("Test case 3: 40 Students");
		CalculateScore test3 = new CalculateScore();
		test3.run(40, "src/data40.txt");

		System.out.println();

		System.out.println("Test case 4: 41 Students");
		CalculateScore test4 = new CalculateScore();
		test4.run(41, "src/data41.txt");

		System.out.println();
	}

}
