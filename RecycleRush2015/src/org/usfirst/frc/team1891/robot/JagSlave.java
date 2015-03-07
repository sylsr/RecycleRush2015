package org.usfirst.frc.team1891.robot;

import edu.wpi.first.wpilibj.Joystick;

public class JagSlave
{
	static boolean hasBeenSet=false;
	JagMaster jagMaster=new JagMaster();
	static double rampRate=5;
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
		jagMaster.breakJags();
		hasBeenSet=false;
	}
	public void startTeleop()
	{
		if(hasBeenSet!=true)
		{
			jagMaster.setAllVoltage();
		}
		jagMaster.setJag2(rampRate*joySlave.setSpeed(6));
		jagMaster.setJag4(rampRate*joySlave.setSpeed(4));
		jagMaster.setJag6(rampRate*joySlave.setSpeed(3));
		jagMaster.setJag3(rampRate*joySlave.setSpeed(5));
		hasBeenSet=true;
	}
	public void setVoltageMode()
	{
		jagMaster.setAllVoltage();
	}
	

}
