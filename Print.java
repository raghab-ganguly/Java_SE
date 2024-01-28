//1.Write a program to print your name.
import java.util.Scanner;
public class Print{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name=sc.nextLine();
		System.out.print(name);
		System.out.println(name);
	}
}

/*Output:
D:\JAVA_CODE>javac Print.java

D:\JAVA_CODE>java Print
Enter your name:
Raghab Ganguly
Raghab Ganguly
*/