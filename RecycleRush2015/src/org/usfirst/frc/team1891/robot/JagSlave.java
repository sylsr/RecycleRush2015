package org.usfirst.frc.team1891.robot;

public class JagSlave
{
	static boolean hasBeenSet=false;
	JagMaster jagMaster=new JagMaster();
	JoystickSlave joySlave= new JoystickSlave(0);
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
		jagMaster.setJag2(4);
		jagMaster.setJag3(-4);
		jagMaster.setJag4(4);
		jagMaster.setJag6(-4);
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
		jagMaster.setJag2(-4);
		jagMaster.setJag3(4);
		jagMaster.setJag4(-4);
		jagMaster.setJag6(4);
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
	public void startTeleop()
	{
		jagMaster.setJag2(joySlave.setSpeed(6));
		jagMaster.setJag4(joySlave.setSpeed(4));
		jagMaster.setJag6(joySlave.setSpeed(3));
		jagMaster.setJag3(joySlave.setSpeed(5));
	}
	public void setVoltageMode()
	{
		jagMaster.setAllVoltage();
	}
	

}
