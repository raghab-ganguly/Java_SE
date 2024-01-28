/*4.Write a program to read the price of an item in the decimal form (like 175.95) 
and print the output in paise (like 17595 paise).
*/
import java.util.Scanner;
public class Price{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the price of an item in the decimal: ");
		double price=sc.nextDouble();
		long paise=(long) (price * 100);
		System.out.print("The price in paise: "+paise);
	}
}

/*output:

D:\JAVA_CODE>javac Price.java

D:\JAVA_CODE>java Price
Enter the price of an item in the decimal: 175.95
The price in paise: 17595
D:\JAVA_CODE>
*/