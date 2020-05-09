package com.sapient.solution3;

enum Calculate implements NumProcess{
	
	A((a,b)->a+b),
	
	S((a,b)->a-b),
	
	M((a,b)->a*b),
	
	D((a,b)->a/b);
	
	
	NumProcess n;
	
	
	Calculate(final NumProcess n) {
		this.n=n;
	}
	
	public double cal(double a,double b) {
		return n.cal(a, b);
	}
	
	
}