
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
	LiftSlave jagLift;
    public void robotInit()
    {
    	jagSlave = new JagSlave();
    	boxAlign=new DriveAlign();
    	talonSlave = new TalonSlave();
    	jagLift = new LiftSlave();
    }
	
	public void disabledPeriodic() 
	{

	}

    public void autonomousInit()
    {

    }


    public void autonomousPeriodic()
    {
    	SmartDashboard.putBoolean("Top Limit Switch", jagLift.topLimitSwitch());
    	SmartDashboard.putBoolean("Bottom Limit Switch", jagLift.bottomLimitSwitch());
    	SmartDashboard.putDouble("P Vaue", jagLift.p());
    	jagLift.liftDown(-1);
    	boxAlign.startDash();
    	talonSlave.spinIn();
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
