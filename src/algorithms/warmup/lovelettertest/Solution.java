package algorithms.warmup.lovelettertest;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner readIn = new Scanner(System.in);
		int test_cases = Integer.parseInt(readIn.nextLine());
		
		for(int i = 0; i < test_cases; i++)
		{
			String letter = readIn.nextLine();
			int operations = 0;
			
			for(int j = 0 ; j < (letter.length()/2); j++)
			{
				if(letter.charAt(j) > letter.charAt(letter.length()-1-j))
				{
					operations += ((int)letter.charAt(j)) - ((int)letter.charAt(letter.length()-1-j));
				}
				else if(letter.charAt(j) < letter.charAt(letter.length()-1-j))
				{
					operations += ((int)letter.charAt(letter.length()-1-j)) - ((int)letter.charAt(j));
				}
			}
			
			System.out.println(operations);
		}
		readIn.close();

	}

}
