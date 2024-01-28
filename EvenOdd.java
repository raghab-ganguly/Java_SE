//6.Write a Java Program to check if a number is Even or Odd.
import java.util.Scanner;
public class EvenOdd{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a integer number: ");
		int num=sc.nextInt();
		if(num % 2 == 0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
}

/*output:
D:\JAVA_CODE>java EvenOdd
Enter a integer number: 145896
Even

D:\JAVA_CODE>java EvenOdd
Enter a integer number: 0
Even

D:\JAVA_CODE>java EvenOdd
Enter a integer number: -45
Odd

D:\JAVA_CODE>
*/