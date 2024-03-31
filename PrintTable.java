package javaprograms;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int num;
		String option="yes";
		String opinion="yes";
		while(option.equalsIgnoreCase(opinion)) {
			System.out.print("Enter the Table:");
			num=s.nextInt();
			for(int i=1;i<=10;i++) {
				System.out.println(num +" x "+i+" = "+num*i);
			}
			System.out.print("if you want to print one more Table?(Yes/No): ");
			opinion=s.next();
		}
		

	}

}
