
package org.usfirst.frc.team1891.robot;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.vision.USBCamera;

import org.usfirst.frc.team1891.robot.commands.ExampleCommand;
import org.usfirst.frc.team1891.robot.subsystems.ExampleSubsystem;


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
    	lifter.test();
    	lifter.moveUp();
    	lifter.startLifterDash();
    	//jagSlave.moveBackwards();
    	/*switch(boxAlign.driveAlign())
    	{
    		case 0:
    			jagSlave.moveForward();
    			break;
    		case 1:
    			switch(boxAlign.centerRobot())
    			{
    				case 0:
    					jagSlave.moveHorizontallyLeft();
    					break;
    				case 1:
    					jagSlave.moveHorizontallyRight();
    					break;
    				case 2:
    					jagSlave.stopRobot();
    					break;
    				default:
    					break;
    			}
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
    }
    

    public void testPeriodic() 
    {

    }
}
