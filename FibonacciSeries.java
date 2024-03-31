package javaprograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.print("plz provide input:");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int previous=0,next=1,result=0;
		for(int i=0;i<=input;i++)
		{
			System.out.println(previous+" ");
			result=previous+next;
			previous=next;
			next=result;
		}
		

	}

}
