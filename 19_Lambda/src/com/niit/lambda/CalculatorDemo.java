package com.niit.lambda;
interface Calculator
{
	public int add(int a,int b);
}
public class CalculatorDemo 
{

	public static void main(String[] args)
	{
		Calculator cal=(a,b)->a+b;
		int res=cal.add(5,7);
		System.out.println(res);

	}

}
