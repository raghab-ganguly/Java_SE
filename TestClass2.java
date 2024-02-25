/*Create a class Test1, make instance variables [int x], 
method [void show()] and use them from main,
declared in different classes.
*/
import java.util.Scanner;
class Test1 {
	int x;
	Test1(int x) {
		this.x=x;
	}
	void show() {
		System.out.println("The value of x is: "+x);
	}
}
public class TestClass2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x;
		Test1 obj;
		System.out.print("Enter the integer value of x: ");
		x=sc.nextInt();
		obj=new Test1(x);
		obj.show();
	}
}

/*output:
Enter the integer value of x: 45
The value of x is: 45
*/