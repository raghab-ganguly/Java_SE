//7.Write a Java Program to check Leap Year.
import java.util.Scanner;
public class LeapYear{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year=sc.nextInt();
		if(year % 4 == 0 && year % 100 != 0 || year % 400 ==0)
			System.out.println(year+" is a Leap year.");
		else
			System.out.println(year+" is not a Leap year.");
	}
}

/*output:
D:\JAVA_CODE>start notepad++ LeapYear.java

D:\JAVA_CODE>javac LeapYear.java

D:\JAVA_CODE>java LeapYear
Enter a year: 2024
2024 is a Leap year.

D:\JAVA_CODE>java LeapYear
Enter a year: 2000
2000 is a Leap year.

D:\JAVA_CODE>java LeapYear
Enter a year: 2100
2100 is not a Leap year.

D:\JAVA_CODE>
*/