package com.java.core.basic.Test;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=input.nextInt();
		String[] str={"even","odd"};
	    System.out.println("Your number "+num+" is "+str[num%2]+"Num");
		
	}

}
