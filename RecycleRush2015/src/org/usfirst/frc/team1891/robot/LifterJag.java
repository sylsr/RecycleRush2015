package org.usfirst.frc.team1891.robot;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.CANJaguar.ControlMode;
import edu.wpi.first.wpilibj.Sendable;

public class LifterJag
{
	//double plo;
	//double pup = plo + 4.732;
	CANJaguar jagLift;
	static boolean mode = false;	
	public LifterJag()
	{
		jagLift = new CANJaguar(5);
	}
	
	public void setVoltageMode()
	{
		if(mode != true)
		{
		jagLift.setVoltageMode();
		jagLift.enableControl();
		mode = true;
		}
		
		
	}
	public void setPositionMode()
	{

			jagLift.setPositionMode(CANJaguar.kQuadEncoder, 1000, 0.0, 0.5, 0.5);
			jagLift.enableControl();
		mode = true;;
	}
	public void jagLiftMove(double setVal)
	{
		jagLift.set(setVal);
	}
	public boolean getTopLimitSwitch()
	{
		return jagLift.getForwardLimitOK();
	}
	public boolean getBottomLimitSwitch()
	{
		return jagLift.getReverseLimitOK();
	}
	public double getPosition()
	{
		return jagLift.getPosition();
	}

	public double getP() 
	{
		return jagLift.getP();
		
	}
	public void stopLifter()
	{
		jagLift.set(0);
	}
	public double setP(double d)
	{
		jagLift.set(d);
		return d;
	}
	
	

}
