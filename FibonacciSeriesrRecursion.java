package javaprograms;
import java.util.Scanner;


public class FibonacciSeriesrRecursion {
	static int previous=0,next=1,temp=0;
public static void Fibonnacci(int input) {
	if(input>0) 
	{
		System.out.print(previous+" ");
		temp=previous+next;
		previous=next;
		next=temp;
		Fibonnacci(input-1);
	
    }
}
	

	public static void main(String[] args) {
		System.out.print("plz provide input:");
		Scanner s=new Scanner(System.in);
		int input=s.nextInt();
		Fibonnacci(input);
		
	
	}
}
