package org.usfirst.frc.team1891.robot;

import edu.wpi.first.wpilibj.CANJaguar;

public class LiftMaster
{
	LifterJag jagLift;
	public LiftMaster()
	{
		jagLift = new LifterJag();
	}
	public void init()
	{
		if(jagLift.getTopLimitSwitch() != false)
		{
			jagLift.enableControl();
		}
		else
		{
			jagLift.setPosition();
			jagLift.getPosition();
			
		}
	}
	public void voltMode()
	{
		jagLift.setVoltage();
	}
	public void positionMode()
	{
		jagLift.setPosition();
	}
	public void moveJag(double val)
	{
		jagLift.jagLiftMove(val);
	}
	public boolean topLimitSwitch()
	{
		return jagLift.getTopLimitSwitch();
	}
	public boolean bottomLimitSwitch()
	{
		return jagLift.getBottomLimitSwitch();
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
