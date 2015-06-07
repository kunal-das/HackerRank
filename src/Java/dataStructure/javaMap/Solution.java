package Java.dataStructure.javaMap;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Map map = new HashMap();
		
		Scanner readInput = new Scanner(System.in);
		
		int test_cases = Integer.parseInt(readInput.nextLine());
		
		String name = null;
		int contact = 0;
		
		for(int i = 0; i < test_cases; i++)
		{
			name = readInput.nextLine();
			contact = Integer.parseInt(readInput.nextLine());
			map.put(name, contact);
		}
		
		while(readInput.hasNextLine())
		{
			name = readInput.nextLine();
			if(map.containsKey(name))
				System.out.println(name+"="+map.get(name));
			else
				System.out.println("Not found");
		}
		
		readInput.close();
	}

}
