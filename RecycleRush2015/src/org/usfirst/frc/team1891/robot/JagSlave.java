package org.usfirst.frc.team1891.robot;

public class JagSlave
{
	static boolean hasBeenSet=false;
	JagMaster jagMaster=new JagMaster();
	/**
	 * Code to move the robot forwards
	 * best to be used in autonomous mode
	 */
	public void moveForward()
	{
		if(hasBeenSet!=true)
		{
			jagMaster.setAllVoltage();
		}
		jagMaster.setJag2(-3);
		jagMaster.setJag3(3);
		jagMaster.setJag4(3);
		jagMaster.setJag6(-3);
		hasBeenSet=true;
	}
	/**
	 * Code to move the robot horizontally right
	 * best to be used in autonomous mode
	 */
	public void moveHorizontallyRight()
	{
		if(hasBeenSet!=true)
		{
			jagMaster.setAllVoltage();
		}
		jagMaster.setJag2(5);
		jagMaster.setJag3(-5);
		jagMaster.setJag4(5);
		jagMaster.setJag6(-5);
		hasBeenSet=true;
	}
	/**
	 * Code to move the robot horizontally left
	 * best to be used in autonomous mode
	 */
	public void moveHorizontallyLeft()
	{
		if(hasBeenSet!=true)
		{
			jagMaster.setAllVoltage();
		}
		jagMaster.setJag2(-5);
		jagMaster.setJag3(5);
		jagMaster.setJag4(-5);
		jagMaster.setJag6(5);
		hasBeenSet=true;
	}
	/**
	 * Code to move the robot backwards
	 * best to be used in autonomous mode
	 */
	public void moveBackwards()
	{
		if(hasBeenSet!=true)
		{
			jagMaster.setAllVoltage();
		}
		jagMaster.setJag2(3);
		jagMaster.setJag3(-3);
		jagMaster.setJag4(-3);
		jagMaster.setJag6(3);
		hasBeenSet=true;
	}
	/**
	 * Code to stop the robot 
	 */
	public void stopRobot()
	{
		if(hasBeenSet!=true)
		{
			jagMaster.setAllVoltage();
		}
		jagMaster.setJag2(0);
		jagMaster.setJag3(0);
		jagMaster.setJag4(0);
		jagMaster.setJag6(0);
		hasBeenSet=true;
	}
}
