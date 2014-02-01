package lab2;
/*
 * Xuefeng Zhai
 * xzhai@cmu.edu
 * Class for read in file and tokenize
 */
import java.io.*;
import java.util.StringTokenizer;


import exception.CustomeException;

public class Util {
	/*
	 * Readfile method
	 */
	static Student [] readFile(String filename, Student [] stu) {
		
		int lineNum = 0;
		try {
			/*
			 * Read in a file
			 */
			FileReader file = new FileReader(filename);
			BufferedReader buff = new BufferedReader(file);
			boolean eof = false; 
			buff.readLine(); 
			/*
			 * While loop to read the lines until reach eof
			 */
			while (!eof) {
				
				String line = buff.readLine(); 				
				if (line == null)
					eof = true; 
				else{
					/*
					 * Tokenize the line
					 */
					StringTokenizer st = new StringTokenizer(line);
					stu[lineNum].setID(Integer.parseInt(st.nextToken()));
					int j=0; //j is used to count the tokens (scores)
					/*
					 * Save the data in the student object
					 */
						while (st.hasMoreTokens()){			
							stu[lineNum].getScores()[j]=Integer.parseInt(st.nextToken());
							j++;
						}
				}
				/*
				 * Throw custome exception when there are more then 40 recoreds
				 */
				try{
					if(lineNum>40){
						throw new CustomeException();
					}
				}
				catch(CustomeException e){
					System.out.println("Custom Exception: There are more then 40 students." +
								"The rest of the records are ignored.");
					break;
				}
				lineNum ++;
			}
			buff.close();
			} catch (IOException e) {
			System.out.println("Error " + e.toString()); }
		
		/*
		 * Return the student objects
		 */
		return stu;
	}
	
}
