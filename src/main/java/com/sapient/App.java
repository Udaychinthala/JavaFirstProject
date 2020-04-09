package com.sapient;
import java.util.Scanner;
public class App 
{
	
	public static boolean CheckNum(int n){
		if(n%2==0) return true;
		return false;
	}
	
	
	public static void main(String[] args){
		System.out.println("Enter the Number");
		Scanner s1=new Scanner(System.in);

		
		int i=s1.nextInt();
		boolean b1=CheckNum(i);

		if(b1==true) System.out.println("Even number!");
		else System.out.println("Odd number!");
	}

	}
