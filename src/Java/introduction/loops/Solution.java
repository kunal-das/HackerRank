package Java.introduction.loops;

import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int test_cases = Integer.parseInt(read.nextLine());
		
		for(int i = 0; i < test_cases; i++)
		{
			String[] variables_info = read.nextLine().split(" ");
			int a = Integer.parseInt(variables_info[0]);
			int b = Integer.parseInt(variables_info[1]);
			int n = Integer.parseInt(variables_info[2]);
			
			if(n == 0)
			{
				System.out.println(a);
			}
			else
			{
				int j = 0;
				int prev_iter_sum = a;
				int curr_iter_sum = 0;
				while(j < n)
				{
					curr_iter_sum = prev_iter_sum + (int)Math.pow(2, j)*b;
					System.out.print(curr_iter_sum + " ");
					prev_iter_sum = curr_iter_sum;
					curr_iter_sum = 0;
					j++;
				}
			}
			System.out.println();
		}

	}

}