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
		jagLift.setVoltage();
		jagLift.jagLiftMove(setVal);
	}
	public void liftDown()
	{
		jagLift.setVoltage();
		jagLift.jagLiftMove(-1);
	}
	public boolean topLimitSwitch()
	{
		return jagLift.getTopLimitSwitch();
	}
	public boolean bottomLimitSwitch()
	{
		return jagLift.getBottomLimitSwitch();
	}

}
