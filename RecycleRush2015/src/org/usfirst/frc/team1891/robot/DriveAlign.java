package org.usfirst.frc.team1891.robot;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class DriveAlign extends InfraredSlave
{
	int currentLeftAverage=super.averageLeft();
	int currentRightAverage=super.averageRight();
	int toleranceSet=(currentLeftAverage-currentRightAverage);
	/**
	 * When robot drives up to a box it will return 1 if the IR sensors detect that the box is close to the back of the
	 * robot. When 1 is returned run centerRobot().
	 * otherwise it will return 0 and this should indicate to keep moving.
	 * 
	 */
	public int driveAlign()
	{
		if(super.averageLeft()>900)
		{
			if(super.averageRight()>900)
			{
				return 1;
			}
			return 0;
		}
		else
		{
			return 0;
		}

	}
	/**
	 * startDash() sends all IR sensor data to the smartdashbaord
	 */
	public void startDash()
	{
		SmartDashboard.putNumber("Average IR Left", super.averageLeft());
		SmartDashboard.putNumber("Average IR Right", super.averageRight());
        //SmartDashboard.putNumber("Infrared Long Right",super.longDataRight());
        //SmartDashboard.putNumber("Infrared Long Left", super.longDataLeft());
        super.startSideDashIR();
	}
	/**
	 * Center robot onto box for lifting mech to work
	 */
	public int centerRobot()
	{
		int rightSide=super.sideIRDataRight();
		int leftSide=super.sideIRDataLeft();
		int toleranceSetSide=(rightSide-leftSide);
		if(toleranceSetSide>300)
		{
			return 0;
		}
		else if(toleranceSetSide<-300)
		{
			return 1;
		}
		else
		{
			return 2;
		}
	}
}

