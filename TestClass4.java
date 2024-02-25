/*
Write a JAVA Program to create a Student class 
with proper attributes like roll no, name, stream, and college.
Create two instances of that class from main (declared in different classes) 
and print them.
*/
import java.util.Scanner;
class Student {
	int roll;
	String name,stream,college;
	Student(int roll,String name,String stream,String college) {
		this.roll=roll;
		this.name=name;
		this.stream=stream;
		this.college=college;
	}
	void show(int count) {
		System.out.println("Student"+count+" Roll: "+roll + " Name: "+name+ " Stream: "+stream+ " College: "+college);
	}
}
public class TestClass4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int roll,count=0;
		String name,stream,college,check;
		System.out.println("Enter your Information: ");
		do{
			count+=1;
			System.out.print("Roll: ");
			roll=sc.nextInt();
			sc.nextLine();
			
			System.out.print("Name: ");
			name=sc.nextLine();
			
			System.out.print("Stream: ");
			stream=sc.nextLine();
			
			System.out.print("College: ");
			college=sc.nextLine();
			
			Student s=new Student(roll,name,stream,college);
			s.show(count);
			
			System.out.print("Any Next Student- 'yes' or 'no' Type: ");
			check=sc.next();
		}while(check.equals("yes"));
		
		sc.close();
	}
}
/*output:
Enter your Information:
Roll: 29
Name: Raghab Ganguly
Stream: CSBS
College: Academy Of Technology
Student Roll: 29 Name: Raghab Ganguly Stream: CSBS College: Academy Of Technology
Any Next Student- 'yes' or 'no' Type: no
*/