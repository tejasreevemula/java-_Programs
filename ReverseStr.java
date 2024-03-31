package javaprograms;

import java.util.Scanner;

public class ReverseStr {

	public static void main(String[] args) {
		System.out.println("Enter Str:");
		Scanner s=new Scanner(System.in);
		String Sentence=s.nextLine();
		
        char letters[]=Sentence.toCharArray();
        
        for(int i=letters.length-1;i>=0;i--)
        {
        	System.out.print(letters[i]);
        }
		
		

	}

}
