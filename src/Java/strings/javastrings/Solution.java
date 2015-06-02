package Java.strings.javastrings;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		String str = read.nextLine();
		int k = Integer.parseInt(read.nextLine());
		
		char[] chrArr = str.toCharArray();
		
		char max_char = 'A';
		int max_char_index = 0;
		char min_char = 'z';
		int min_char_index = 0;
		
		for(int index = 0; index <= (chrArr.length - k); index++)
		{
			if(chrArr[index] >= max_char)
			{	max_char_index = index;
				max_char = chrArr[index];
			}
			else if(chrArr[index] <= min_char)
			{
				min_char_index = index;
				min_char = chrArr[index];
			}
		}
		
		String max_substring = ""+max_char;
		String min_substring = ""+min_char;
		
		for(int j = 1; j < k; j++)
		{
			max_substring += chrArr[max_char_index + j];
			min_substring += chrArr[min_char_index + j];
		}
		
		System.out.println(min_substring);
		System.out.println(max_substring);
		
		
	}

}
