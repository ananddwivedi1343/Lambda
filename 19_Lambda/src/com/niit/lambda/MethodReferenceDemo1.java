package com.niit.lambda;
interface MyInterface
{
	void display();
}
class Test
{
	public void myMethod()
	{
		System.out.println("instance Method");
	}
}
public class MethodReferenceDemo1 
{

	public static void main(String[] args)
	{
		Test t =new Test();
		MyInterface ref=t::myMethod;//method reference to instance method of object
		ref.display
		();
    }
}
