package Java.introduction.datatypes;

import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       int tests = Integer.parseInt(read.nextLine());
        
        for(int i = 0; i < tests; i++)
            {
            String num = read.nextLine();
		try
		{
			Byte n = Byte.parseByte(num);
			System.out.println(num+" can be fitted into : \n* byte\n* short\n* int\n* long");
		}
		catch(NumberFormatException e1)
		{
			try
			{
				Short n = Short.parseShort(num);
				System.out.println(num + " can be fitted into:\n* short\n* int\n* long");
			}
			catch(NumberFormatException e2)
			{
				try
				{
					Integer n = Integer.parseInt(num);
					System.out.println(num + " can be fitted into:\n* int\n* long");
				}
				catch(NumberFormatException e3)
				{
					try
					{
						Long n = Long.parseLong(num);
						System.out.println(num + " can be fitted into:\n* long");
					}
					catch(NumberFormatException e4)
					{
						System.out.println(num + " can't be fitted anywhere.");
					}
				}
			}
		
		}
        }
    }
}