package javaprograms;
import java.util.Scanner;

public class Factorial {
	
public static void Factorialnum(int input) {
	if (input<0) 
	{
		System.out.print("invalid number");
	}
	else
	{
		int fact=1;
		for(int i=input;i>0;i--)
		{
			fact=fact*i;
		}
		System.out.print("factorial of "+input  +"is "+ fact);
		
	}
}
	public static void main(String[] args) {
		System.out.print("Enter number");

		Scanner s=new Scanner(System.in);
		int input=s.nextInt();
		Factorialnum(input);
		
		
	}
}
