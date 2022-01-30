package com.ibs.lambdabasics;

public class TypeInferenceTest2 {
	public static void main(String[] args) {
		
		printLambda(s->s.length());

	}
	
	public static void printLambda(LambdaStringLength l){
	System.out.println(l.getLength("Hello World"));
	}

	interface LambdaStringLength{
		int getLength(String s);
	}
}
