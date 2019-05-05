import java.util.*;
import java.io.*;


/**
 * This class read in the CSV file 
 */
public class RiskLevel {
	
	private String filename; 
// may need this to be an Integer ArrayList instead of a String 	
	private ArrayList<String> level; 
	
	/**
	 * 
	 * @param filename
	 * @return
	 */
	public RiskLevel (String file) {
		
		filename = file; 
	// Initialize new empty array list of strings 
		level = new ArrayList<String>();
		readFile();
		
		
	}
		

// method to read in the file 	
	private void readFile() {
		// try catch block added in-case file does not exist 
		try {
			
			File inputFile = new File (filename);
		// create a scanner to read in the file 
			Scanner in = new Scanner (inputFile);
			// need to skip the first line that because it is the headers 
			in.hasNextLine();
			
		// create a while loop to go through whole file and scans to see if there is a next line
			while (in.hasNextLine()) {
			
				String line = in.nextLine(); 
				level.add(line);
				
			}
			// close the scanner
			in.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Method to return the levels of the ArrayList 
	 */
	
	public ArrayList <String> getLevel(){
		
		return level;
	}
	
	
//// creates a string Array List 
//	public static ArrayList <String> readAsList (String filename){
//		ArrayList<String> result = new ArrayList <String>(); 
//		try {
//			Scanner sc = new Scanner (new File(filename));
//			sc.nextLine(); 
//			while (sc.hasNextLine()) {
//				result.add(sc.nextLine());
//			
//			}
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		return result; 
//		
//	}
//// reads in the Arraylist of Strings
//	public static String [] readAsArray(String filename) {
//		String[] result = new String [100]; 
//		
//		return result; 
//	}
//	
//// saves the ArrayList
//	 public static ArrayList <String> readAsList(String filename) {
//		 ArrayList<String> result = new ArrayList<String>(); 
//		 
//		 return result; 
//	 }
	 
// this method will look through the Arraylist for the Customers Risk level 
	 public static void CustomerRiskLevel() {
		 
	 }
}
