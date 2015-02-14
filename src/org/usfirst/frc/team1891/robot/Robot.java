
package org.usfirst.frc.team1891.robot;

//import edu.wpi.first.wpilibj.AnalogAccelerometer;
import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.CounterBase;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Joystick.ButtonType;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.PIDCommand;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.SampleRobot;

import org.usfirst.frc.team1891.robot.DriveMaster;
import org.omg.CORBA.portable.UnknownException;
public class Robot extends IterativeRobot 
{

//	public static final ExampleSubsystem exampleSubsystem = new ExampleSubsystem();
//	public static OI oi;
	Command autonomousCommand;
	//Instantiates jags with appropriate ID's
    CANJaguar jag3;
    CANJaguar jag4;
    CANJaguar jag5;
    CANJaguar jag6;
    CANJaguar jag7;
    JAGValue jagMaster= new JAGValue();
//    AccelMaster IMU;
//    DigitalSensorMaster digitalSwitch;
//    ServoMaster servo1;
//    Potentiometer pot1;
//    InfraredSlave autoMove;
    public void robotInit()
    {
//    	oi = new OI();
		jag3 = new CANJaguar(6);
		jag4 = new CANJaguar(4);
		jag5 = new CANJaguar(3);
		jag6 = new CANJaguar(2);
		jag7 = new CANJaguar(5);
//		IMU = new AccelMaster();
//		digitalSwitch=new DigitalSensorMaster();
//		servo1 = new ServoMaster();
//		pot1 = new Potentiometer();
//		autoMove= new InfraredSlave();
    }
	
	public void disabledPeriodic() 
	{
		Scheduler.getInstance().run();
	}

    public void autonomousInit()
    {

        if (autonomousCommand != null) autonomousCommand.start();
       
    }

    public void autonomousPeriodic()
    {
    	
        Scheduler.getInstance().run();
//        IMU.startDash();
//		SmartDashboard.putBoolean("Testing",digitalSwitch.testDigitalInput()); 
//		autoMove.infraredDash();
//		if(autoMove.SensorForward()==true)
		{
			jag3.set(0.1);
			jag4.set(-0.1);
			jag5.set(-0.1);
			jag6.set(0.1);}
			
		}
//		if(autoMove.SensorLeft()==true)
//		{
//			jag3.set(-0.1);
//			jag4.set(-0.1);
//			jag5.set(0.1);
//			jag6.set(0.1);
//			
//		}
//		if(autoMove.SensorRight()==true)
//		{
//			jag3.set(0.1);
//			jag4.set(0.1);
//			jag5.set(-0.1);
//			jag6.set(-0.1);
//			
//		}
//		if(autoMove.SensorBack()==true)
//		{
//			jag3.set(-0.1);
//			jag4.set(0.1);
//			jag5.set(0.1);
//			jag6.set(-0.1); }
//			
//		}
//		else if(autoMove.SensorForward()==false)
//		{
//			if(autoMove.SensorLeft()==false)
//			{
//				if(autoMove.SensorRight()==false)
//				{
//					if(autoMove.SensorBack()==false)
//					{
//						jag3.set(0);
//						jag4.set(0);
//						jag5.set(0);
//						jag6.set(0);
//					}
//				}
//			}
//			
//		}
//        
//    }

    public void teleopInit() 
    {
    	
        if (autonomousCommand != null)
        {
        	autonomousCommand.cancel();
        }        
     }   	
        	
    public void disabledInit() 
    {

    }

	public void teleopPeriodic() 
    {
		if (jagMaster.roboDrive.getButton(4)) {
		jag7.set(jagMaster.liftArm());
		if (jagMaster.liftArm() > 0) {
			System.out.println("Lift Current (down):"
					+ jag7.getOutputCurrent());
		}else{
			System.out.println("Lift Current (up):"
					+ jag7.getOutputCurrent());
		}
		}else{
		Scheduler.getInstance().run();
		jag3.set(jagMaster.setSpeed(3));
		jag4.set(jagMaster.setSpeed(4));
		jag5.set(jagMaster.setSpeed(5));
		jag6.set(jagMaster.setSpeed(6));
		}
		//		IMU.startDash();
//		SmartDashboard.putBoolean("Testing",digitalSwitch.testDigitalInput());  
//		servo1.start();
//		SmartDashboard.putNumber("Potentiometer", pot1.returnAngle());
    }


    public void testPeriodic() 
    {
        LiveWindow.run();
    }
}
