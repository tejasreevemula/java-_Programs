package javaprograms;
import java.util.Scanner;

public class FactorialRecursion {
	public static int FactorialRecur(int input)
	{
		if(input==0 || input==1) 
		{
			return 1;
			
		}
		else 
		{
			return input*FactorialRecur(input-1);
		}
		
		
	}

	public static void main(String[] args) {
		System.out.print("enter:");
		Scanner s=new Scanner(System.in);
		int input=s.nextInt();
		if (input<0) 
		{
			System.out.print("invalid number");
		}
		else 
		{
			
			
			//FactorialRecursion using range
			for (int i=1;i<=input;i++) { 
				int result=FactorialRecur(i);
				System.out.println(i+"!="+result);
			}
				
					
		}
		

   }
}
	//FactorialRecursion 
    //int result=FactorialRecur(input);
    //System.out.println(input+"!="+result);


