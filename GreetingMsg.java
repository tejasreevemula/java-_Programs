package javaprograms;

import java.util.Scanner;

public class GreetingMsg {

	public static void main(String[] args) {
		System.out.print("Enter name:");
		Scanner s=new Scanner(System.in);
		String name=s.next();
		System.out.print("Hi...."+name);

	}

}
