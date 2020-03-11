package com.niit.lambda;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class Stream1 {

	public static void main(String[] args)
	{
		
		// TODO Auto-generated method stub
      List<String> names= Arrays.asList("Mike","Sam","Jhon","Danny","Jef");
      Stream<String> n=names.stream();
      Stream<String> ln=n.filter(str->str.length()>3);
      ln.forEach(str->System.out.print(str+" "));
      System.out.println("**************************");
      List<String> ln1=names.stream().filter(str->str.length()>4).ln1.forEach(System.out::println);
      System.out.println("***************************");
      List<Integer>num=Arrays.asList(2,3,4,5);
      List<Integer> squares=num.stream().map(m->m*m).collect(collectors.toList());
      System.out.println(squares);
      
	}

}
