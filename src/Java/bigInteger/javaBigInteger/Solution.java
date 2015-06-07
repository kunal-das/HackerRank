package Java.bigInteger.javaBigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner readInput = new Scanner(System.in);
		BigInteger numOne = new BigInteger(readInput.nextLine());
		BigInteger numTwo = new BigInteger(readInput.nextLine());
		
		System.out.println(numOne.add(numTwo));
		System.out.println(numOne.multiply(numTwo));
		
		readInput.close();

	}

}
