package com.ibs.lambdabasics;
public class TypeInferenceTest1 {

	public static void main(String[] args) {
		
		stringLambda myLambda = s->s.length();
		System.out.println(myLambda.getLength("Hello Hai"));

	}
	
	interface stringLambda{
		int getLength(String s);
	}
}
