package lab2;
/*
 * Xuefeng Zhai
 * xzhai@cmu.edu
 * A class of student
 */

public class Student extends People{
	/*
	 * Properties for student
	 */
	private int SID;
	private int scores[];
	
	/*
	 * Constructors for student
	 */
	Student(){
		scores=new int[5];
	}
	
	/*
	 * Getters
	 */
	public int getID(){
		return SID;
	}
	
	public int[] getScores() {
		return scores;
	}
	
	/*
	 * Setters
	 */
	public void setID(int sID) {
		this.SID = sID;
	}


	public void setScores(int[] scores) {
		this.scores = scores;
	}
	
	/*
	 * Print the values of each student
	 */
	public void printValues(){
		System.out.println(SID+"	"+scores[0]+"	"+scores[1]+
				"	"+scores[2]+"	"+scores[3]+
				"	"+scores[4]);
	}
	
}
