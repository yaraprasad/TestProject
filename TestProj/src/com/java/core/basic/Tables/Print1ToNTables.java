package com.java.core.basic.Tables;

import java.util.Scanner;

public class Print1ToNTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Last Number for Multiplication table");
		int num=input.nextInt();
	System.out.println("======  START  ======");
for(int i=1;i<=num;i++){
	for(int j=1;j<=10;j++){
		System.out.println(i+" X "+j+" = "+(i*j));
	}
	System.out.println("=======  END   =====");
}
	}

}
