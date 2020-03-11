package com.niit.lambda;

public class MultiAlarm implements Vehicle {
	
	public  String turnAlarmOn()
    {
    	return "Turning the Vehicle Alarm ON";
    }
     public  String turnAlarmOff()
    {
    	return "Turning the vehicle Alarm OFF";
    }
     public String getBrand() {
 		// TODO Auto-generated method stub
 		return "brand";
 	}

 	
 	public String speedUp() {
 		// TODO Auto-generated method stub
 		return "The car is Speeding up";
 	}

 	
 	public String slowDown() {
 		// TODO Auto-generated method stub
 		return "The car is slowing down";
 	}
public static void main(String args[])
{
	Vehicle var=new MultiAlarm();
	System.out.println(var.getBrand());
    System.out.println(var.speedUp());
    System.out.println(var.slowDown);
    System.out.println(var.turnAlarmOn());
    System.out.println(var.turnAlarmOff());
    System.out.println(Vehicle.getHorsePower(2500,480));
    
}

}
