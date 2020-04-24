import java.util.Scanner;

public class Fibanoci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		 System.out.println( );
		 int i=0, j=1,k ;
		
		 for (int c=0;c<n;c++)
		 {
		 if(c<=1)
			k=c;
		 else {
		k=i+j;
		i=j;
		j=k;
			}
		 System.out.print( k);
		 }
	
	}

}

/*
 * output: Enter the number : 5
 * 
 * 01123
 */