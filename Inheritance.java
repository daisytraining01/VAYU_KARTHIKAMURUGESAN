

public class Inheritance {

	public void displayA()
	{
		System.out.println("Display A");
	}
public class B extends Inheritance
{
	public void displayB()
	{
		System.out.println("Display B");
	}


public static void main (String args[])
{
	B b =new B();
	b.displayA();
	b.displayB();
	}
}}