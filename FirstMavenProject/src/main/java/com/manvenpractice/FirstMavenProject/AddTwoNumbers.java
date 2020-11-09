package com.manvenpractice.FirstMavenProject;
import java.util.Scanner;
public class AddTwoNumbers {

	static int a,b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a and b");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Sum of a and b is"+(a+b));
        
	}

}
