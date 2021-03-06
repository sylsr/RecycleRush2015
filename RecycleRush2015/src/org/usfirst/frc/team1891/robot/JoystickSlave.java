package org.usfirst.frc.team1891.robot;

public class JoystickSlave 
{
	JoystickMaster joyMaster;
	public JoystickSlave(int portNum)
	{
		joyMaster = new JoystickMaster(portNum);
	}
	public double setSpeed(int Index)
	{
		double Speed = 0;
		double x = joyMaster.getXAxis();
		double y = joyMaster.getYAxis();
		double z = joyMaster.getZAxis();
		double damp = getPrecisionMode();
		
		double a = (y - z - x) * damp;
		double b = (y + z + x) * damp;
		double c = (y + z - x) * damp;
		double d = (y - z + x) * damp;
		
		//double overflow = getOverflow(a, b, c, d);
		
		
		if (Index == 3)
		{
			Speed = a *8;
		}
		if (Index == 4)
		{
			Speed = -b *8;
		}
		if (Index == 5)
		{
			Speed = -c *8;
		}
		if (Index == 6)
		{
			Speed = d *8;
		}
		
		
		
		
		/**
		FrontLeft (jag 4) = Y + Z + X
		RearLeft(jag 5) = Y + Z - X
		FrontRight(jag 3) = Y - Z - X
		RearRight(jag 6) = Y - Z + X
		**/
		
		
		return Speed;
	}
	
	public double getPrecisionMode()
	{
		double damp = 1;
		
		//for slider on joystick damp
		//if(joyMaster.getProfile() == 3||joyMaster.getProfile()==1){
		/*	damp = (-joyMaster.getSlider() + 1) * .35 + .3;
		}
		for xbox360 r trigger damp
		else if (joyMaster.getProfile() == 2){
			damp = 1-joyMaster.getSlider() * .7;
		}*/
		
		
		//for single button damp

		if(joyMaster.getButton(2) == true){
			damp = .2;
	}
	
		
		return damp;
	}
	
	
	//this method checks if any joystick inputs are greater than one, and if they
	//are, it returns a fraction to keep the jags running at the same ratio
	
	public double getOverflow(double a, double b, double c, double d)
	{
		a = Math.abs(a);
		b = Math.abs(b);
		c = Math.abs(c);
		d = Math.abs(d);
		
		double max = Math.max(Math.max(a,b), Math.max(c, d));
		double reciprocal = 1;
		
		if (max >= 1)
		{
			reciprocal = 1/max;
		}
		
		
		
		return reciprocal;


	}
		
}
