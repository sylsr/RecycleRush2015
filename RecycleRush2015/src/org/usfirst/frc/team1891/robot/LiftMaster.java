package org.usfirst.frc.team1891.robot;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class LiftMaster
{
	static boolean hitSwitch=false;
	LifterJag jagLift;
	static double currentP;
	public LiftMaster()
	{
		jagLift = new LifterJag();
	}
	public int turnOn()
	{
		if(hitSwitch!=true)
		{
			if(jagLift.getBottomLimitSwitch()!=false)
			{
				jagLift.setVoltageMode();
				jagLift.jagLiftMove(-5.0);
				return 0;
			}
			else
			{
				jagLift.setPositionMode();
				hitSwitch=true;
			}
		}
		return 1;
	}
	public double getPosition()
	{
		return jagLift.getPosition();
	}
	public void moveUpward()
	{
		jagLift.setP(1.0);
	}
	public void stop()
	{
		jagLift.setP(0);
	}
	public void siftDash()
	{
		SmartDashboard.putBoolean("Top limit Switch", jagLift.getTopLimitSwitch());
		SmartDashboard.putBoolean("Bottom limit Switch", jagLift.getBottomLimitSwitch());
	}
	public void moveDown()
	{
		jagLift.setP(-3);
	}
	public void set(double setVal)
	{
		jagLift.jagLiftMove(setVal);
	}
	public void setVoltageMode()
	{
		jagLift.setVoltageMode();
	}
}
