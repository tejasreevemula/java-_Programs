package javaprograms;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Digits:");
		int num=s.nextInt();
		int sum=0;
		
		while(num!=0) {
			sum=sum+(num%10);
			num=num/10;
			
		}
		System.out.print("Sum of Digits:"+sum);
		
		
		

	}

}
