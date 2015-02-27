package org.usfirst.frc.team1891.robot;

import edu.wpi.first.wpilibj.CANJaguar;

public class LifterJag 
{
	CANJaguar jagLift;
	
	public LifterJag()
	{
		jagLift = new CANJaguar(5);
	}
	
	public void setVoltageMode()
	{
		jagLift.setVoltageMode();
		jagLift.enableControl();
		
	}
	public void setPositionMode()
	{
		jagLift.setPositionMode(CANJaguar.kQuadEncoder, 1000, 0, 0, 0);
		jagLift.enableControl();
	}
	public void jagLiftMove(int setVal)
	{
		jagLift.enableControl();
		jagLift.set(setVal);
	}
	
	

}
