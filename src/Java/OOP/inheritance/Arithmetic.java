package Java.OOP.inheritance;

class Arithmetic {
	
	int add(long x, long y)
	{
		System.out.println("Hello, I am the adder function");
		return 0;
	}

}

class Adder extends Arithmetic
{
	public int add(long x, long y)
	{
		return ((int)(x + y));
	}
}
