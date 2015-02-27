package org.usfirst.frc.team1891.robot;

import edu.wpi.first.wpilibj.CANJaguar;

public class JagMaster 
{
	CANJaguar jag2;
	CANJaguar jag3;
	CANJaguar jag4;
	CANJaguar jag6;
	public JagMaster()
	{
		jag2=new CANJaguar(2);
		jag3=new CANJaguar(3);
		jag4=new CANJaguar(4);
		jag6=new CANJaguar(6);
	}
	public void setAllVoltage()
	{
		jag2.setVoltageMode();
		jag3.setVoltageMode();
		jag4.setVoltageMode();
		jag6.setVoltageMode();
		jag2.enableControl();
		jag3.enableControl();
		jag4.enableControl();
		jag6.enableControl();
	}
	
}
