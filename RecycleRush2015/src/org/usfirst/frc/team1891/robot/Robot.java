
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
	
    public void robotInit()
    {
    	jagSlave = new JagSlave();
    	boxAlign=new DriveAlign();
    	talonSlave = new TalonSlave();
    	lifter=new LiftSlave();
    	serv = new ServoMaster();
    	joyMaster = new JoystickMaster(0);
    	
    }
	
	public void disabledPeriodic() 
	{

	}

    public void autonomousInit()
    {

    }


    public void autonomousPeriodic()
    {
   
    	boxAlign.startDash();
    	talonSlave.spinIn();
    	SmartDashboard.putNumber("Testing boxAlign.driveAlign()",boxAlign.driveAlign());
    	SmartDashboard.putNumber("Testing boxAlign.centerRobot()",boxAlign.centerRobot());
    	//jagSlave.moveBackwards();
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
    	if(joyMaster.getButton(4))
    	{
    		switch(boxAlign.driveAlign())
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
        	}	
    	}
    	if(joyMaster.getButton(5))
    	{
    		serv.leftOn();
    	}
    	else
    	{
    		serv.leftOff();
    	}
    	if(joyMaster.getButton(6))
    	{
    		serv.rightOn();
    	}
    	else 
    	{
    		serv.rightOff();
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

    }
}
