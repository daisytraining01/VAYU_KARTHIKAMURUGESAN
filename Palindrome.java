import java.util.Scanner;


public class Palindrome {

	public static void main(String[] args) {
		String text,reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		text= sc.nextLine();
		int length= text.length();
		for (int i=length-1;i>=0;i--)
			reverse=reverse+text.charAt(i);
		if(text.contentEquals(reverse))
		{
			System.out.print("Entered string is palindrome");
		}
		else {
			System.out.println("Entered string is not palindrome");
		}
		
	}

}

/*
 * output Enter the string : malayalam Entered string is palindrome
 */