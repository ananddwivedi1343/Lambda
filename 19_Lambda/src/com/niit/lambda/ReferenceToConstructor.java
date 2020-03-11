package com.niit.lambda;
interface Messageable
{
	Message getMessage(String msg);
}
class Message
{
	Message(String msg)
	{
		System.out.println(msg);
	}
}
public class ReferenceToConstructor {
public static void main()
{
	Messageable m=Message::new;
	m.getMessage("Hello World");
}
}
