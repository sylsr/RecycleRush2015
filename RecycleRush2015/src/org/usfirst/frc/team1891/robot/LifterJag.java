package org.usfirst.frc.team1891.robot;

import edu.wpi.first.wpilibj.CANJaguar;

public class LifterJag
{
	double plo;
	double pup = plo + 4.732;
	CANJaguar jagLift;
	boolean mode = false;
	
	public LifterJag()
	{
		jagLift = new CANJaguar(5);
	}
	
	public void setVoltage()
	{
		mode = false;
		if(mode != true)
		{
		jagLift.setVoltageMode();
		jagLift.enableControl();
		mode = true;
		}
		
		
	}
	public void setPosition()
	{
		if(mode!= true)
		{
		jagLift.setPositionMode(CANJaguar.kQuadEncoder, 1000, plo, 0.5, 0.5);
		jagLift.enableControl();
		}
		mode = false;
	}
	public void jagLiftMove(double setVal)
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
	public double getPosition()
	{
		return jagLift.getPosition();
	}
	
	
	

}
