package com.niit.lambda;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class DefaultDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LocalDate d=LocalDate.now();
     LocalTime t=LocalTime.now();
     LocalDateTime dt=LocalDateTime.now();
     
     System.out.println(d);
     System.out.println(t);
     System.out.println(dt);
     ZoneId z1=ZoneId.of("Asia/Tokyo"); 
     LocalTime t1=LocalTime.now(z1);
     System.out.println("Japan Time is:"+t1);
     Vehicle car=new Car("BMW");
     System.out.println(car.getBrand());
	}

}
