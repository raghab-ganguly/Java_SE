/* Write a program to calculate the Simple Interest (si) 
while your inputs are principle (p), time in years (n) and rate of interest (r). 
*/

import java.util.Scanner;
public class SimpleInterest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principle,years and rate of interest acordingly: ");
		double p=sc.nextDouble();
		int t=sc.nextInt();
		float r=sc.nextFloat();
		double si;
		si=(p * r * t)/100;
		System.out.println("Simple Interest is : "+si);
		
		sc.close();
	}
}
/*output:
D:\JAVA_CODE>javac SimpleInterest.java

D:\JAVA_CODE>java SimpleInterest
Enter the principle,years and rate of interest acordingly:
1000.20 2 4.5
Simple Interest is : 90.01800000000001

D:\JAVA_CODE>
*/