package com.niit.lambda;

public interface Vehicle
{
	String getBrand();
    String speedUp();
    String slowDown();
    default String turnAlarmOn()
    {
    	return "Turning the Vehicle Alarm ON";
    }
    default String turnAlarmOff()
    {
    	return "Turning the vehicle Alarm OFF";
    }
    static int getHorsePower(int rpm,int torque)
    {
    	return (rpm*torque)/5252;
    }
}
