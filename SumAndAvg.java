package javaprograms;

import java.util.Scanner;

public class SumAndAvg {

	public static void main(String[] args) {
		System.out.print("how manys value do you want to add:");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int sum=0;
		
		int arr[]=new int[size];
		System.out.print("Enter numbers:");
		
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
			sum=sum+arr[i];
		}
		double sum1=sum;
		System.out.println("sum of numbers:"+sum);
		System.out.println("Avg of numbers:"+sum1/size);
		
		
		
		
		

	}

}
