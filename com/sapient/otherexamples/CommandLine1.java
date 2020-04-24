package com.sapient.otherexamples;

public class CommandLine1 {

	
	
	public boolean intDataPresent=false;
	Integer[] intData;

	public void setData(String[] arg) {
		
		intData=new Integer[arg.length];
		
		intDataPresent=true;
		
		for(int i=0;i<arg.length;i++) {
			intData[i]=Integer.parseInt(arg[i]);
		}
		
	}

	public void calData() {
		
		if(!intDataPresent) {
		
			System.out.println("No intData");
			return;
		}
		
		System.out.println("intData intDataPresent :");
		for(int i=0;i<intData.length;i++) {
			System.out.println(intData[i]);
		}
		
	}

	public void sumData() {
		// TODO Auto-generated method stub
		if(!intDataPresent) {
			System.out.println("No intData");
			return;
		}
		int sum=0;
		for(int i=0;i<intData.length;i++) {
			sum+=intData[i];
		}
		System.out.println("Sum ="+sum);
		
	}

	public void avgData() {
		
		if(!intDataPresent) {
			System.out.println("No intData");
			return;
		}
		
		int sum=0;
		
		for(int i=0;i<intData.length;i++) {
			sum+=intData[i];
		}
		
		double avg=(double)sum/intData.length;
		
		System.out.println("Average is "+avg);
	}

	public void biggestData() {
		
		if(!intDataPresent) {
			System.out.println("No Data Available");
			return;
		
		}
		
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<intData.length;i++) {
			if(intData[i]>max)
				max=intData[i];
		}
		
		System.out.println("Max-value is "+max);
	}

	public void smallestData() {
		
		if(!intDataPresent) {
			System.out.println("No Data Available");
			return;
		}
		
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<intData.length;i++) {
			if(intData[i]<min)
				min=intData[i];
		}
		
		System.out.println("Min-value is "+min);
	}


}
