package javaprograms;

import java.util.Scanner;

public class ArthmeticOpertions {


	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.print("enter num1:");
		int n1=s.nextInt();
		System.out.print("enter num2:");
		int n2=s.nextInt();
		
		double sum=n1+n2;
		double sub=n1-n2;
		double mul=n1*n2;
		double div=n1/n2;
		double mod=n1%n2;
		System.out.println("sum: "+ sum);
		System.out.println("subtraction :"+sub);
		System.out.println("multiplication :" +mul);
		System.out.println("division :"+div);
		System.out.println("modules :"+mod);
		
		
	}

}
