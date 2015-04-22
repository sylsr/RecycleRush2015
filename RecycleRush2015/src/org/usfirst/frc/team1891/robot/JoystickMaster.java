package org.usfirst.frc.team1891.robot;

import edu.wpi.first.wpilibj.CANJaguar;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class JoystickMaster
{
	
	
	//Instantiates joystick
	Joystick joyRight;
	// sets DEADZONE around all axis
	public final double DEADZONE=0.2;
	//constructor for DriveMaster
	public JoystickMaster(int joyPort) 
	{
		
		joyRight= new Joystick(joyPort);
	}
	//returns DEADZONE
	public double getDEADZONE()
	{
		return DEADZONE;
	}
	//gets the profile
	public int getProfile()
	{
		//for main logitech joystick and logitech controller
		int profileIndex = 1;
		
		//for xbox controller
		if (joyRight.getButtonCount() == 10) profileIndex = 2;
		
		//for logitech attack 3 joystick
		if (joyRight.getButtonCount() == 11) profileIndex = 3;
		
		return profileIndex;
	}
	//gets the modified y axis from the joystick that tests against deadzone
	
	public double getYAxis()
	{
		return getDead(joyRight.getRawAxis(0));
			
	}
	//gets the modified x axis from the joystick that tests against deadzone
	public double getXAxis()
	{
		return getDead(-joyRight.getX());
		
	}
	//gets the modified z axis from the joystick that tests against deadzone; for joystick RawAxis index is 2, for xbox index is 4
	public double getZAxis()
	{
		double z = 0;
		if (getProfile() == 1)
		{
			z = getDead(-joyRight.getZ());
		}
		if (getProfile() == 2)
		{
			z = getDead(-joyRight.getRawAxis(4));
		}
		if (getProfile()==3)
		{
			z = buttonDrive();
		}
		return z;
		
	}
	
	public double getDead(double a)
	{
		
		if(Math.abs(a) > DEADZONE)
		{
			return a;
		}
		return 0;
	}
	
	public boolean getButton(int button)
	{
		
		return joyRight.getRawButton(button);
	}
	
	public double getSlider()
	{
		double slider = 0;
		if(getProfile() == 3){
			slider = joyRight.getZ();
		}else{
			slider = joyRight.getRawAxis(3);
		}
		return slider;
	}
	public double buttonDrive()
	{
		double button = 0;
		if(getButton(4)==true){
			button = 1;
		}
		if(getButton(5)==true){
			button = -1;
		}
		return button;
	}
	public double getPrecisionMode()
	{
		double damp = 0.8;
		
		//for slider on joystick damp
		//if(joyMaster.getProfile() == 3||joyMaster.getProfile()==1){
		/*	damp = (-joyMaster.getSlider() + 1) * .35 + .3;
		}
		for xbox360 r trigger damp
		else if (joyMaster.getProfile() == 2){
			damp = 1-joyMaster.getSlider() * .7;
		}*/
		
		
		//for single button damp

		if(getButton(2) == true)
		{
			damp = 1.0;
		}
		return damp;
	}
	
}