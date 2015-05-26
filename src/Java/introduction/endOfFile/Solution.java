package Java.introduction.endOfFile;

//import java.io.File;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner readIn = new Scanner(System.in);
		int lineNumber = 1;
		
		while(readIn.hasNextLine())
		{
			String content = readIn.nextLine();
			System.out.println(lineNumber + " " + content);
			lineNumber++;
		}
		
		readIn.close();

	}

}
