//2.	Write a Java Program to print your college name by taking input through command line arguments.
import java.util.Scanner;
public class College{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your college name: ");
		String college=sc.nextLine();
		System.out.print("your college is: "+college);
	}
}

/*output:
D:\JAVA_CODE>start notepad++ College.java

D:\JAVA_CODE>javac College.java

D:\JAVA_CODE>java College
Enter your college name: Academy Of Technology(AOT)
your college is: Academy Of Technology(AOT)
D:\JAVA_CODE>
*/