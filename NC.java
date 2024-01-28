/*3.	 Write a Java Program to take two inputs (name and college name) through command line argument and print as follows:
<name> is a BTECH student of <college name> college.
(e.g.:     Input: Ram  AOT
				Output: Ram is a BTECH student of AOT college)
*/

import java.util.Scanner;
public class NC{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name and college name: ");
		String name=sc.next();
		String c_name=sc.next();
		System.out.print(name+" is a BTECH student of "+c_name+" college");
	}
}

/*output:
D:\JAVA_CODE>start notepad++ NC.java

D:\JAVA_CODE>javac NC.java

D:\JAVA_CODE>java NC
Enter your name and college name: Raghab AOT
Raghab is a BTECH student of AOT college
D:\JAVA_CODE>
*/