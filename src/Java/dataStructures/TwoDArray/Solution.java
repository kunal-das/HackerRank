package Java.dataStructures.TwoDArray;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner readIn = new Scanner(System.in);
		int[][] matrix = new int[6][6];
		String lineOfNumbers = null;
		String[] arrayOfIntegers = new String[6];
		
		for(int i = 0; i < 6; i++)
		{
			lineOfNumbers = readIn.nextLine(); // reads the line of integers as a string
			arrayOfIntegers = lineOfNumbers.split(" "); // breaks the string into array of strings.
			
			/*
			 * The inner for loop is used to put the numbers into the integer array. 
			 */
			for(int j = 0; j < 6; j++)
			{
				matrix[i][j] = Integer.parseInt(arrayOfIntegers[j]);
			}
		}
		
		
		
		int hourglass_sum = 0;
		int max_sum = -100;
		
		for(int starting_row = 0; starting_row <= matrix.length-3; starting_row++)
		{
			for(int starting_col = 0; starting_col <= matrix[starting_row].length-3; starting_col++)
			{
				for(int r = starting_row; r < (starting_row+3); r++)
				{
					
					for(int c = starting_col; c < (starting_col+3); c++)
					{
						if(r==(starting_row+1))
						{
							//System.out.println(" "+matrix[starting_row+1][starting_col+1]);
							hourglass_sum += matrix[starting_row+1][starting_col+1];
							break;
						}
						else
							hourglass_sum += matrix[r][c];
						//System.out.print(matrix[r][c]);
						
					} // c close
					//System.out.println();
				} // r close
				
				if(hourglass_sum > max_sum)
					max_sum = hourglass_sum;
				
				hourglass_sum = 0;
				
			} // starting_ col close
			
			
		} // starting row close
		
		System.out.println(max_sum);
	}
}
		 
		 
		
		
		