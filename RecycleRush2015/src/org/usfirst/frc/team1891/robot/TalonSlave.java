package org.usfirst.frc.team1891.robot;

public class TalonSlave {
	
	TalonMaster TalonM;
	public TalonSlave()
	{
		TalonM = new TalonMaster();
	}
	
	public void spinIn()
	{
		TalonM.spinWheels();
	}
	
	public void spinOut()
	{
		TalonM.spinWheelsBack();
	}
	public void stop()
	{
		TalonM.stop();
	}
}
