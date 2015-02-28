package org.usfirst.frc.team1891.robot;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class LiftMaster
{
	static boolean hitSwitch=false;
	LifterJag jagLift;
	static double startBottomPosition=0;
	public LiftMaster()
	{
		jagLift = new LifterJag();
	}
	public int turnOn()
	{
		if(hitSwitch!=true)
		{
			jagLift.setVoltageMode();
			if(jagLift.getBottomLimitSwitch()!=false)
			{
				jagLift.jagLiftMove(-2.0);
				return 0;
			}
			else
			{
				jagLift.setPositionMode();
				startBottomPosition=jagLift.getPosition();
				hitSwitch=true;
				return 1;
			}
		}
		return 1;
	}
	public double getPosition()
	{
		return jagLift.getPosition();
	}
	public void moveUpwards()
	{
		jagLift.jagLiftMove(3.0);
	}
	public void siftDash()
	{
		SmartDashboard.putBoolean("Top limit Switch", jagLift.getTopLimitSwitch());
		SmartDashboard.putBoolean("Bottom limit Switch", jagLift.getBottomLimitSwitch());
	}
}
