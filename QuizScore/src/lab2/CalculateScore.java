package lab2;


/*
 * Xuefeng Zhai
 * xzhai@cmu.edu
 * A class to call the methods to calculate the scores
 */
public class CalculateScore {
	/*
	 * run method to take the number of students
	 * and filename as parameters to run the calculations
	 */
	public void run(int stuNum,String fileName){
		/*
		 * Initialize student arry
		 */

		Student[] lab2 = new Student[stuNum];
		for(int i=0;i<stuNum;i++){
			lab2[i]=new Student();
		}
		
		/*
		 * Call the readFile method of Util
		 * to read in the data
		 */
		lab2 = Util.readFile(fileName, lab2);
		/*
		 * Initialize a statistics object
		 * call its method to calculate and
		 * display the result
		 */
		Statistics statlab2 = new Statistics();
		statlab2.findlow(lab2);
		statlab2.findavg(lab2);
		statlab2.findhigh(lab2);
		
		System.out.println("Stud	Q1	Q2	Q3	Q4	Q5");
		
		for (int j=0;j<stuNum;j++){
			lab2[j].printValues();
		}
		System.out.println("-----------------------------------------------------");
		statlab2.printScores();	
		
			
	}

}
