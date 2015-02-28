package org.usfirst.frc.team1891.robot;



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
	public void liftDown(double setVal)
	{
		jagLift.voltMode();
		if(jagLift.bottomLimitSwitch() == false)
		{
			jagLift.moveJag(0);
		}
		else
		jagLift.moveJag(setVal);
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
		jagLift.positionMode();
		return jagLift.getPosition();
	}

}
