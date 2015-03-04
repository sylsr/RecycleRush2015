package org.usfirst.frc.team1891.robot;

import oracle.jrockit.jfr.events.DynamicValueDescriptor;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;



public class LiftSlave
{
	static boolean configurationComplete=false;
	static double lifterPosition;
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
		SmartDashboard.putNumber("lifter Position", lifterPosition);
		jagLift.siftDash();
	}
	public void moveUp()
	{
		lifterPosition=Math.abs(jagLift.getPosition());
		if(configurationComplete!=false)
		{
			System.out.println("Lifter:"+lifterPosition);
			if(lifterPosition<=0.15)
			{
				jagLift.moveUpward();
			}
			else
			{
				jagLift.stop();
			}
		}
	}

	
}
