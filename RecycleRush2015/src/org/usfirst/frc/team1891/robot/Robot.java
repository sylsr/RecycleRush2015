
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
	
	
    public void robotInit()
    {
    	jagSlave = new JagSlave();
    	boxAlign=new DriveAlign();
    	talonSlave = new TalonSlave();
    	lifter=new LiftSlave();
    	
    	
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
    	//lifter.test();
    	//lifter.moveUp();
    	lifter.telopMoveUp();
    	lifter.startLifterDash();
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
    	SmartDashboard.putBoolean("Right trigger", jagSlave.joyButton7());
    	SmartDashboard.putBoolean("Left trigger", jagSlave.joyButton8());
    	lifter.startLifterDash();
    	if(jagSlave.joyButton7() && jagSlave.joyButton8() == true)
    	{
    		lifter.stop();
    	}
    	else if(jagSlave.joyButton7()==true)
    	{
    		lifter.telopMoveUp();
    	}
    	else if(jagSlave.joyButton8()==true)
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
