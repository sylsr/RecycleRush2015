
package org.usfirst.frc.team1891.robot;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
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
    	boolean hasStopped=false;
  	jagSlave.moveForward();
  	navX.startDash();
    	/*switch(navX.intoAutoZone())
    	{
	    	case 0:
	    		if(hasStopped!=true)
	    		{
	    			jagSlave.moveForward();
	    		}
	    		break;
	    	case 1:
	    		jagSlave.stopRobot();
	    		hasStopped=true;
	    		break;
	    	default:
	    		jagSlave.stopRobot();
	    		break;
    	}*/
    	if(navX.intoAutoZone()==0)
    	{
    		if(hasStopped!=true)
    		{
    			jagSlave.moveForward();
    		}
    	}
    	else if(navX.intoAutoZone()==1)
    	{
    		jagSlave.stopRobot();
    		hasStopped=true;
    	}
    	/*switch(boxAlign.driveAlign())
    	{
    		case 0:
    		{
    			jagSlave.moveForward();
    		}
    			break;
    		case 1:
	    		{
	    			switch(boxAlign.centerRobot())
	    			{
	    				case 0:
	    				{
	    					jagSlave.moveHorizontallyRight();
	    				}
	    					break;
	    				case 1:
	    				{
	    					jagSlave.moveHorizontallyLeft();
	    				}
	    					break;
	    				case 2:
	    				{
	    					jagSlave.stopRobot();
	    				}
	    					break;
	    				default:
	    					break;
	    			}
	    		}
	    		break;
    		default:
    			break;
    	}*/
    }

    public void teleopInit() 
    {
    	//jagSlave.setVoltageMode();

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
