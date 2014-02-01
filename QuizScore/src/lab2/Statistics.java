package lab2;


public class Statistics  {

	/*
	 * Define the variables
	 */
	private int [] lowscores = new int[5];
	private int [] highscores = new int [5];
	private float [] avgscores = new float [5];
	
	/*
	 * Method to calculate low score of every quiz
	 */
	public void findlow(Student [] a){
		for(int i=0;i<5;i++){
			lowscores[i]=10000;
			for(int j=0;j<a.length&&j<40;j++){
				int studentScore[]=a[j].getScores();
				if(studentScore[i]<lowscores[i]){
					lowscores[i]=studentScore[i];
				}
			}
		}
	}
	
	/*
	 * Method to calculate high score of every quiz
	 */
	public void findhigh(Student [] a){
		for(int i=0;i<5;i++){
			highscores[i]=-1;
			for(int j=0;j<a.length&&j<40;j++){
				int studentScore[]=a[j].getScores();
				if(studentScore[i]>highscores[i]){
					highscores[i]=studentScore[i];
				}
			}
		}
}	
	/*
	 * Method to calculate average score of everu quiz
	 */
	public void findavg(Student [] a){
		for(int i=0;i<5;i++){
			avgscores[i]=0;
			for(int j=0;j<a.length&&j<40;j++){
				int studentScore[]=a[j].getScores();
					avgscores[i]+= studentScore[i];
			}
			if(a.length<40){
				avgscores[i]=avgscores[i]/a.length;
			}// if there are more then 40 records
			// ignore those after 40
			else{
				avgscores[i]=avgscores[i]/40;
			}
		}

	}
	
	/*
	 * Method to print out the result
	 */
	public void printScores(){
		System.out.println("High Score  	 "+highscores[0]+"	"+highscores[1]+"	"
				+highscores[2]+"	"+highscores[3]+"	"+highscores[4]);
		System.out.println("Low Score  	 "+lowscores[0]+"	"+lowscores[1]+"	"
				+lowscores[2]+"	"+lowscores[3]+"	"+lowscores[4]);
		System.out.println("Average  	 "+avgscores[0]+"	"+avgscores[1]+"	"
				+avgscores[2]+"	"+avgscores[3]+"	"+avgscores[4]);
	}

}
