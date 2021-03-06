package org.usfirst.frc.team1891.robot;

import edu.wpi.first.wpilibj.CANJaguar;

public class JagMaster 
{
	
	CANJaguar jag2;
	CANJaguar jag3;
	CANJaguar jag4;
	CANJaguar jag6;
	public JagMaster()
	{
		
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
		jag6.setVoltageMode();
		jag2.enableControl();
		jag3.enableControl();
		jag4.enableControl();
		jag6.enableControl();
		jag2.setVoltageRampRate(0.1);
		jag3.setVoltageRampRate(0.1);
		jag4.setVoltageRampRate(0.1);
		jag6.setVoltageRampRate(0.1);
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
	public void breakJags()
	{
		jag2.disableControl();
		jag3.disableControl();
		jag4.disableControl();
		jag6.disableControl();
	}
	
	
	
}
