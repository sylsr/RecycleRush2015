package org.usfirst.frc.team1891.robot;

import edu.wpi.first.wpilibj.CANJaguar;

public class JagMaster 
{
	//CANJaguar liftJag;
	CANJaguar jag2;
	CANJaguar jag3;
	CANJaguar jag4;
	CANJaguar jag6;
	public JagMaster()
	{
		//liftJag = new CANJaguar(5);
		jag2=new CANJaguar(2);
		jag3=new CANJaguar(3);
		jag4=new CANJaguar(4);
		jag6=new CANJaguar(6);
	}
	/**
	 * Instantiates all the drive jags in voltage mode
	 */
	public void setAllVoltage()
	{
		jag2.setVoltageMode();
		jag3.setVoltageMode();
		jag4.setVoltageMode();
		//liftJag.setVoltageMode();
		jag6.setVoltageMode();
		jag2.enableControl();
		jag3.enableControl();
		jag4.enableControl();
		//liftJag.enableControl();
		jag6.enableControl();
	}
	/**
	 * gets a voltage value and sets jag 2 to that voltage value
	 * @param setVal
	 */
	public void setJag2(double setVal)
	{
		jag2.set(setVal);
	}
	/**
	 * gets a voltage value and sets jag 3 to that voltage value
	 * @param setVal
	 */
	public void setJag3(double setVal)
	{
		jag3.set(setVal);
	}
	/**
	 * gets a voltage value and sets jag 4 to that voltage value
	 * @param d
	 */
	public void setJag4(double d)
	{
		jag4.set(d);
	}
	/**
	 * gets a voltage value and sets jag 6 to that voltage value
	 * @param setVal
	 */
	public void setJag6(double setVal)
	{
		jag6.set(setVal);
	}
	public void setLift(double setVal)
	{
		//liftJag.set(setVal);
	}
	
	
}
