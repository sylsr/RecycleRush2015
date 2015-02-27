
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
	TalonSlave talonSlave;
    public void robotInit()
    {
    	talonSlave= new TalonSlave();
    }
	
	public void disabledPeriodic() 
	{

	}

    public void autonomousInit()
    {

    }


    public void autonomousPeriodic()
    {
    	talonSlave.spinIn();
    }

    public void teleopInit() 
    {


    }

    public void disabledInit()
    {

    }


    public void teleopPeriodic()
    {

    }
    

    public void testPeriodic() 
    {

    }
}
