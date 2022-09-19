import java.util.Scanner;

public class IfelseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int a= sc.nextInt();
		int c=a%2;
		if(a%2==0)
		{
			System.out.println("Given number is \"Even \" and reminder = "+c);
		}
		else
		{
			System.out.println("Given number is \"Odd\" and remender = "+c);
		}

	}

}
