package org.usfirst.frc.team1891.robot;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class InfraredSlave
{
	InfraredMaster IRMaster;
	public InfraredSlave()
	{
		IRMaster = new InfraredMaster();
	}
	AverageInfraredData averageInfraredLeft = new AverageInfraredData();
	AverageInfraredData2 averageInfraredRight = new AverageInfraredData2();
	/**
	 * averageLeft() puts the LinkedList data in, averages it and then returns the average of 10 integers
	 * @return
	 */
	public int averageBackLeft()
	{
		averageInfraredLeft.add(IRMaster.getDistanceLeft());
		return averageInfraredLeft.getAverage();
	}
	/**
	 *  averageRight() puts the LinkedList data in, averages it and then returns the average of 10 integers
	 * @return
	 */
	public int averageBackRight()
	{
		averageInfraredRight.add(IRMaster.getDistanceRight());
		return averageInfraredRight.getAverage();
	}
	public int IRDataRight()
	{
		return IRMaster.getSideRightDistance();
	}
	public int IRDataLeft()
	{
		return IRMaster.getSideLeftDistance();
	}
	public void startSideDashIR()
	{
		SmartDashboard.putNumber("Right side", IRMaster.getSideRightDistance());
		SmartDashboard.putNumber("Left side", IRMaster.getSideLeftDistance());
	}
	
	
}