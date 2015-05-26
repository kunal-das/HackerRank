package algorithms.warmup.utopiantree;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner readInput = new Scanner(System.in);
		int testCases = Integer.parseInt(readInput.nextLine());
		
		for(int i = 0; i < testCases;i++){
			int heightTree = 1;
			int growthCycles = Integer.parseInt(readInput.nextLine());
			
			if(growthCycles != 0)
			{
				for(int j = 1; j <= growthCycles; j++)
				{
					if(j%2 != 0)
					{
						heightTree *= 2;
					}
					else
					{
					heightTree += 1;
					}
				}
			}
				
			System.out.println(heightTree);
		}
		readInput.close();

	}

}
