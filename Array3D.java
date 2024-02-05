//Raghab Ganguly
//Basic 3 Dimentional array concept..

import java.util.Scanner;
public class Array3D {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][][] arr=new int[2][2][2];
		System.out.println("Enter the value of 3D array: ");
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				for(int k=0;k<2;k++)
					arr[i][j][k]=sc.nextInt();
			}
		}
		
		System.out.println("output: ");
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				for(int k=0;k<2;k++){
					System.out.print(" "+arr[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		} 
	
	}
}
/*output:
Enter the value of 3D array:
10 20 30 40 50 60 70 80
output:
 10 20
 30 40

 50 60
 70 80
 */