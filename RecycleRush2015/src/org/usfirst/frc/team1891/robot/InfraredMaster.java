package org.usfirst.frc.team1891.robot;

import edu.wpi.first.wpilibj.AnalogInput;

public class InfraredMaster
{
	AnalogInput infraredBackLeft;
	AnalogInput infraredBackRight;
	AnalogInput infraredRight;
	AnalogInput infraredLeft;
	public InfraredMaster()
	{	
		infraredLeft= new AnalogInput(0);
		infraredBackLeft =new AnalogInput(1);
		infraredBackRight = new AnalogInput(2);
		infraredRight=new AnalogInput(3);
	
	}
	/**
	 * returns the value of the back left IR sensor
	 * @return
	 */
	public int getDistanceLeft()
	{
		return infraredBackLeft.getValue();
	}
	/**
	 * returns the value of the back right IR sensor
	 * @return
	 */
	public int getDistanceRight()
	{
		return infraredBackRight.getValue();
	}
	/**
	 * returns the value of the right IR sensor, the one that is on the side of the robot
	 * @return
	 */
	public int getSideRightDistance()
	{
		return infraredRight.getValue();
	}
	/**
	 * returns the value of the left IR sensor, the one that is on the side of the robot
	 * @return
	 */
	public int getSideLeftDistance()
	{
		return infraredLeft.getValue();
	}
	
}