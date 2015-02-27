package org.usfirst.frc.team1891.robot;

import edu.wpi.first.wpilibj.CANJaguar;

public class LiftMaster extends LifterJag
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

}
