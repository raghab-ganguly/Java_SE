/*Create a class; put a method inside this class which 
will return a class reference of the same class and/or
different class object.
*/
class Test {
	int x;
	Test(int x) {
		this.x=x;
	}
}

public class TestClass3 {
	int x;
	TestClass3(int x) {
			this.x=x;
	}
	static TestClass3 method1(int x) {
		TestClass3 obj=new TestClass3(x);
		System.out.println("Same class return type method is called");
		return obj;
	}
	static Test method2(int x) {
		Test obj=new Test(x);
		System.out.println("Different class return type method is called");
		return obj;
	}
	public static void main(String[] args) {
		TestClass3 obj1;
		obj1=method1(10);
		System.out.println("The value of x is: "+obj1.x);
		
		Test obj2;
		obj2=method2(20);
		System.out.println("The value of x is: "+obj2.x);
	}
}
/*output:
Same class return type method is called
The value of x is: 10
Different class return type method is called
The value of x is: 20
*/

