package org.usfirst.frc.team1891.robot;

import edu.wpi.first.wpilibj.CANJaguar;

public class LiftMaster 
{
	CANJaguar jagLift;
	public LiftMaster()
	{
		LifterJag jagLift = new LifterJag();
	}
	public double Init()
	{
		if(jagLift.getForwardLimitOK() != false)
		{
			jagLift.enableControl();
		}
	}

}
