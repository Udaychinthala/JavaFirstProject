package com.sapient.otherexamples;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class KeyReadLine2 {
	
	
	boolean dataPresent=false;
	int[] intData;
	
	public void read() {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=s.nextInt();
		
		intData=new int[n];
		dataPresent=true;
		
		System.out.println("Enter the data");
		for(int i=0;i<n;i++) {
			intData[i]=s.nextInt();
		}
	}

	public void display() {
		
		if(!dataPresent) {
			System.out.println("No Data ");
			return;
		}
		
		System.out.println("Displaying the data :");
		
		for(int i=0;i<intData.length;i++) {
		
		System.out.println(intData[i]);
		}
	}

	public void sort() {
		
		if(!dataPresent) {
		
		System.out.println("No Data Available");
			return;
		}
		
		Arrays.sort(intData);
		
		System.out.println("Sorting  Data... ");
		
		for(int i=0;i<intData.length;i++) {
			System.out.println(intData[i]);
		}
	}

	public void find(int x) {
		
		if(!dataPresent) {
			
			System.out.println("No Data Available ");
			return;
		}
		
		for(int i=0;i<intData.length;i++) {
		
		if(x==intData[i]) {
				System.out.println("Found!");
				return;
			}
		}
		
		System.out.println("Not Found!!");
	}

}
