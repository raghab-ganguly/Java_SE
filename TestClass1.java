/*Create a class Test, make instance variable [int x], 
method [void show()] and also put main method inside
that class and use the instance variable and method from main.
*/

import java.util.Scanner;
public class TestClass1 {
	int x;
	TestClass1(int x) {
		this.x=x;
	}
	void show() {
		System.out.println("The value of x is: "+x);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x;
		TestClass1 obj;
		System.out.print("Enter the integer value of x: ");
		x=sc.nextInt();
		obj=new TestClass1(x);
		obj.show();
	}
}

/*output:
Enter the integer value of x: 20
The value of x is: 20
*/
