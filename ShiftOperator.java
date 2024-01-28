//Write a Java Program to multiply a number by 2 and divide the same number by 4 using shift operator. 

import java.util.Scanner;
public class ShiftOperator
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num,mul,div;
		System.out.print("Enter a integer number: ");
		num=sc.nextInt();
		mul=num << 1; //left shift operator --> num << n = num * 2 ^ n ; n=1,2,3...
		div=num >> 2; //Right Shift operator -->num >> n = num / 2 ^ n ; n=1,2,3...
		System.out.println("The number is: "+num);
		System.out.println("number x 2 = "+mul);
		System.out.println("number / 4 = "+div);
		
		sc.close();
	}
}

/*output:
D:\JAVA_CODE>javac ShiftOperator.java

D:\JAVA_CODE>javap ShiftOperator
Compiled from "ShiftOperator.java"
public class ShiftOperator {
  public ShiftOperator();
  public static void main(java.lang.String[]);
}

D:\JAVA_CODE>java ShiftOperator
Enter a integer number: 4
The number is: 4
number x 2 = 8
number / 4 = 1

D:\JAVA_CODE>
*/
		
		
