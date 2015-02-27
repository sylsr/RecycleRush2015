package org.usfirst.frc.team1891.robot;

import edu.wpi.first.wpilibj.CANJaguar;

public class LifterJag
{
	CANJaguar jagLift;
	boolean mode = false;
	
	public LifterJag()
	{
		jagLift = new CANJaguar(5);
	}
	
	public void setVoltage()
	{
		if(mode != false)
		{
		jagLift.setVoltageMode();
		jagLift.enableControl();
		}
		mode = true;
		
	}
	public void setPosition()
	{
		if(mode!= false)
		{
		jagLift.setPositionMode(CANJaguar.kQuadEncoder, 1000, 0, 0, 0);
		jagLift.getPosition();
		jagLift.enableControl();
		}
		mode = true;
	}
	public void jagLiftMove(int setVal)
	{
		jagLift.set(setVal);
	}
	public boolean getTopLimitSwitch()
	{
		return jagLift.getForwardLimitOK();
	}
	public boolean getBottomLimitSwitch()
	{
		return jagLift.getReverseLimitOK();
	}
	public void enableControl()
	{
		jagLift.enableControl();
	}
	public void getPosition()
	{
		jagLift.getPosition();
	}
	
	

}
