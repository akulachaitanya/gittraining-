import java.util.Scanner;

public class IfElseLader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int studentMarks = sc.nextInt();
		
		if(studentMarks<50)
		{
			System.out.println("try agen");
		}
		else if(studentMarks>=50 && studentMarks<60)
		{
			System.out.println("improve your self");
		}
		else if(studentMarks>=60 && studentMarks<70)
		{
			System.out.println("your doin good job");
		}
		else if(studentMarks>=70 && studentMarks<90)
		{
			System.out.println("your work is too good");
		}
		

	}

}
