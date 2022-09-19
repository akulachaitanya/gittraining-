import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age =sc.nextInt();
		System.out.println("Enter your weigth");
		int weight=sc.nextInt();
		if(age>18)
		{
			if(weight>=51)
			{
				System.out.println("you can donate blood");
			}
			else
			{
				System.out.println("your not eligible to donate blood");
			}
		}
		else
		{
			System.out.println("your not eligible to donate blood");
		}

	}

}
