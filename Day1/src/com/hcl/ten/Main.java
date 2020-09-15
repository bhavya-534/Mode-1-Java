package com.hcl.ten;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Sentence:");
		Scanner scanner=new Scanner(System.in);
		String sentence =scanner.nextLine();
		scanner.close();
		
		UserMainCode usermaincode =new UserMainCode();
		System.out.println(usermaincode.getLargestWord(sentence));
		
	}

}
