public class Overloading {
public int sum (int a,int b )
{
	return(a+b);
	
}
public int sum (int a,int  b,int c) {
	return (a+b-c);
}
	public static void main(String[] args) {
	Overloading s=new Overloading();
	System.out.println(s.sum(2, 5));
	System.out.println(s.sum(2, 5,4));
	}

}


/*
 * output: 7 3
 */