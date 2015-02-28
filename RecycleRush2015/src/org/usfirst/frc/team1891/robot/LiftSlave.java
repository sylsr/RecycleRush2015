package org.usfirst.frc.team1891.robot;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;



public class LiftSlave
{
	static boolean configurationComplete=false;
	LiftMaster jagLift;

	public LiftSlave()
	{	
		jagLift = new LiftMaster();

	}
	public void test()
	{
		if(configurationComplete!=true)
		{
			if(jagLift.turnOn()==1)
			{
				configurationComplete=true;
			}
			jagLift.turnOn();
		}
	}
	public void startLifterDash()
	{
		SmartDashboard.putNumber("Testing Lifter Position", jagLift.getPosition());
		jagLift.siftDash();
	}
	public void moveUp()
	{
		if(configurationComplete!=false)
		{
		
			jagLift.moveUpwards();
		}
	}
	
}
