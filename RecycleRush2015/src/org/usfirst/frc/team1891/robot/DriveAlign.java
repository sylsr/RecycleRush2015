package org.usfirst.frc.team1891.robot;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class DriveAlign extends InfraredSlave
{
	int currentLeftAverage=super.averageBackLeft();
	int currentRightAverage=super.averageBackRight();
	int toleranceSet=(currentLeftAverage-currentRightAverage);
	/**
	 * When robot drives up to a box it will return 1 if the IR sensors detect that the box is close to the back of the
	 * robot. When 1 is returned run centerRobot().
	 * otherwise it will return 0 and this should indicate to keep moving.
	 * 
	 */
	public int driveAlign()
	{
		if(super.averageBackLeft()>1000)
		{
			if(super.averageBackRight()>1000)
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
		SmartDashboard.putNumber("Average IR Left", super.averageBackLeft());
		SmartDashboard.putNumber("Average IR Right", super.averageBackRight());
        //SmartDashboard.putNumber("Infrared Long Right",super.longDataRight());
        //SmartDashboard.putNumber("Infrared Long Left", super.longDataLeft());
        super.startSideDashIR();
	}
	/**
	 * Center robot onto box for lifting mech to work
	 * returns 0 if the  box is to far right
	 * returns 1 if the box is to far left
	 * returns 2 if the box has been centered
	 */
	public int centerRobot()
	{
		int rightSide=super.IRDataRight();
		int leftSide=super.IRDataLeft();
		int toleranceSetSide=(rightSide-leftSide);
		if(toleranceSetSide<125)
		{
			return 0;
		}
		else if(toleranceSetSide>-125)
		{
			return 1;
		}
		else
		{
			return 2;
		}
	}
}

