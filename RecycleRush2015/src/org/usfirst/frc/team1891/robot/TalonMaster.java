package org.usfirst.frc.team1891.robot;

import edu.wpi.first.wpilibj.Talon;

public class TalonMaster {
	Talon talon1;
	Talon talon2;
	public TalonMaster()
	{
		talon1 = new Talon(2);
		talon2 = new Talon(3);
	}
	
	public void spinWheels()
	{
		talon1.set(0.3);
		talon2.set(-0.3);
	}
	
	public void spinWheelsBack()
	{
		talon1.set(-0.3);
		talon2.set(0.3);
	}
	
	public void stopWheels()
	{
		talon1.set(0);
		talon2.set(0);
	}
}
