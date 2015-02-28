package org.usfirst.frc.team1891.robot;

import edu.wpi.first.wpilibj.Sendable;

public class LiftSlave
{
	LiftMaster jagLift;

	public LiftSlave()
	{
		jagLift = new LiftMaster();
	}
	public void liftUp(double setVal)
	{
		jagLift.voltMode();
		jagLift.moveJag(setVal);
	}
	public void liftDown()
	{
		jagLift.voltMode();
		jagLift.moveJag(-1);
	}
	public boolean topLimitSwitch()
	{
		return jagLift.topLimitSwitch();
	}
	public boolean bottomLimitSwitch()
	{
		return jagLift.bottomLimitSwitch();
	}
	public void usingPValue()
	{
		jagLift.positionMode();
	}
	public double p()
	{
		return jagLift.getPosition();
	}

}
