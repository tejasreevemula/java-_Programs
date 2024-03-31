package javaprograms;
import java.util.Scanner;
public class ReverseString {
	public static void Reverse(String input) {
		
		
		System.out.print("Reverse of" + input +":");
		
		
		for(int i=input.length()-1;i>=0;i--)
		{
			String result=" ";
			 
			 result+=input.charAt(i);
			
			System.out.print(result);
			
		}
	}

	public static void main(String[] args) {
		System.out.print("enter string name:");
		Scanner s=new Scanner(System.in);
		String input =s.next();
		Reverse(input);

	}

}
