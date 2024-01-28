/*
5.Write a program to convert the given temperature in Fahrenheit to Celsius 
using the following formula: 	C /5 = (F-32)/9.
*/
import java.util.Scanner;
public class FtoC{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter temperature in Fahrenheit: ");
		float temp=sc.nextFloat();
		float tempInCel=(temp-32)/9 * 5;
		System.out.print("Temperature in celsius: "+tempInCel);
	}
}

/*output:
D:\JAVA_CODE>start notepad++ FtoC.java

D:\JAVA_CODE>javac FtoC.java

D:\JAVA_CODE>java FtoC
Enter temperature in Fahrenheit: 60
Temperature in celsius: 15.555555
D:\JAVA_CODE>
*/