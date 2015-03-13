
package org.usfirst.frc.team1891.robot;

import com.ni.vision.NIVision;
import com.ni.vision.NIVision.DrawMode;
import com.ni.vision.NIVision.ShapeMode;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.vision.USBCamera;




public class Robot extends IterativeRobot
{
	JagSlave jagSlave;
	DriveAlign boxAlign;
	TalonSlave talonSlave;
	LiftSlave lifter;
	ServoMaster serv;
	JoystickMaster joyMaster;
	AutoZone navX;
	static boolean hasStopped=false;
    public void robotInit()
    {
    	jagSlave = new JagSlave();
    	boxAlign=new DriveAlign();
    	talonSlave = new TalonSlave();
    	lifter=new LiftSlave();
    	serv = new ServoMaster();
    	joyMaster = new JoystickMaster(0);
    	navX = new AutoZone();
    	
    }
	
	public void disabledPeriodic() 
	{

	}

    public void autonomousInit()
    {
    	
    }


    public void autonomousPeriodic()
    {
  	navX.startDash();
    	SmartDashboard.putNumber("intoAutoZone()", navX.intoAutoZone());
    	if(navX.intoAutoZone()==0)
    	{
    		jagSlave.moveForward();
    	}
    	else if(navX.intoAutoZone()==1)
    	{
    		jagSlave.stopRobot();
    	}
    }

    public void teleopInit() 
    {

    }

    public void disabledInit()
    {

    }


    public void teleopPeriodic()
    {
    	boxAlign.startDash();
    	jagSlave.startTeleop();
    	SmartDashboard.putBoolean("Right trigger", joyMaster.getButton(7));
    	SmartDashboard.putBoolean("Left trigger", joyMaster.getButton(8));
    	lifter.startLifterDash();
    	navX.startDash();
    	if(joyMaster.getButton(5))
    	{
    		serv.leftOff();
    	}
    	else
    	{
    		serv.leftOn();
    	}
    	if(joyMaster.getButton(6))
    	{
    		serv.rightOff();
    	}
    	else 
    	{
    		serv.rightOn();
    	}
    	
    	if(joyMaster.getButton(7) && joyMaster.getButton(8))
    	{
    		lifter.stop();
    	}
    	else if(joyMaster.getButton(7))
    	{
    		lifter.telopMoveUp();
    	}
    	else if(joyMaster.getButton(8))
    	{
    		lifter.telopMoveDown();
    	}
    	else
    	{
    		lifter.stop();
    	}
    	
    	
    	
 
    }
    

    public void testPeriodic() 
    {
    	boxAlign.startDash();
    }
}
