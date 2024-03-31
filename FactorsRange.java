package javaprograms;
import java.util.Scanner;
public class FactorsRange {
	public static void FindFactors(int input) {
		System.out.print("factors of" + input +"are:");
		for(int i=1;i<=input;i++)
		{
			if (input%i==0) 
			{
				System.out.print(i +" ");
			}
			
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.print("Plz Enter number:");
		Scanner s=new Scanner(System.in);
		int input=s.nextInt();
		if (input<0) {
			System.out.print("Invalid number");
		}
		else 
		{
			
			for(int i=1;i<=input;i++) {
				FindFactors(i);
			}
			
		}
		

	}

}
