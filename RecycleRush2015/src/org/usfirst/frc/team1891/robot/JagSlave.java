package org.usfirst.frc.team1891.robot;

public class JagSlave
{
	JagMaster jagMaster=new JagMaster();
	/**
	 * Code to move the robot forwards
	 * best to be used in autonomous mode
	 */
	public void moveForward()
	{
		jagMaster.setAllVoltage();
		jagMaster.setJag2(1);
		jagMaster.setJag3(1);
		jagMaster.setJag4(1);
		jagMaster.setJag6(1);
	}
	/**
	 * Code to move the robot horizontally right
	 * best to be used in autonomous mode
	 */
	public void moveHorizontallyRight()
	{
		jagMaster.setAllVoltage();
	}
	/**
	 * Code to move the robot horizontally left
	 * best to be used in autonomous mode
	 */
	public void moveHorizontallyLeft()
	{
		jagMaster.setAllVoltage();
	}
	/**
	 * Code to move the robot backwards
	 * best to be used in autonomous mode
	 */
	public void moveBackwards()
	{
		jagMaster.setAllVoltage();
	}
	/**
	 * Code to stop the robot 
	 */
	public void stopRobot()
	{
		jagMaster.setAllVoltage();
		jagMaster.setJag2(0);
		jagMaster.setJag3(0);
		jagMaster.setJag4(0);
		jagMaster.setJag6(0);
	}
}
