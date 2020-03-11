package com.niit.lambda;
//@FunctionalInterface
interface NumericTest
{
	boolean computeTest(int n);
}
public class Lambda1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
          NumericTest isEven=(n)->(n%2)==0;
          NumericTest isNegative=(n)->(n<0);
          System.out.println(isEven.computeTest(5));
          System.out.println(isNegative.computeTest(-5));
 	}

}
