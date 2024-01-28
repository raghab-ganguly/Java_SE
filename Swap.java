//Write a Java Program to swap two numbers using the bitwise operator.

import java.util.Scanner;
public class Swap {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		System.out.println("Before Swap: ");
		System.out.println(x +" "+ y);
		
		x= x ^ y;
		y= x ^ y;
		x= x ^ y;
		
		System.out.println("After Swap: ");
		System.out.println(x +" "+y);
		
	}
}
/*output:

D:\JAVA_CODE>java Swap
Enter two numbers:
100 56
Before Swap:
100 56
After Swap:
56 100

D:\JAVA_CODE>java Swap
Enter two numbers:
-55 2
Before Swap:
-55 2
After Swap:
2 -55

D:\JAVA_CODE>
*/