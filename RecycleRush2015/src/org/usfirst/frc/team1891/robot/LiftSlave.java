package org.usfirst.frc.team1891.robot;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;



public class LiftSlave
{
	int volt1 = 1;
	static boolean configurationComplete=false;
	static double lifterPosition;
	LiftMaster jagLift;

	public LiftSlave()
	{	
		jagLift = new LiftMaster();

	}
	public void startLifterDash()
	{
		SmartDashboard.putNumber("Testing Lifter Position", jagLift.getPosition());
		SmartDashboard.putNumber("lifter Position", lifterPosition);
		jagLift.siftDash();
		while(volt1 == 1)
		{
			jagLift.setVoltageMode();
			volt1++;
		}
	}
	public void telopMoveUp()
	{
		jagLift.set(6);
	}
	public void telopMoveDown()
	{
		jagLift.set(-6);
	}
	public void stop()
	{
		jagLift.stop();
	}

	
}
