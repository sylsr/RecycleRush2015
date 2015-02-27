package org.usfirst.frc.team1891.robot;

public class LiftSlave 
{
	LiftMaster jagLift;
	public LiftSlave()
	{
		jagLift = new LiftMaster();
	}
	public void liftUp()
	{
		jagLift.setVoltage();
		jagLift.jagLiftMove(-2);
	}

}
