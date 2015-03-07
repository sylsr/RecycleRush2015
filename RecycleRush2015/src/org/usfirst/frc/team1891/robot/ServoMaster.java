package org.usfirst.frc.team1891.robot;
import edu.wpi.first.wpilibj.Servo;
public class ServoMaster extends ServoSlave
{
		public void on() 
		{
		servl.setAngle(60);
		servr.setAngle(145);
		}
		public void reset() 
		{
		servl.setAngle(175);
		servr.setAngle(20);
		}
		public void leftOn()
		{
			servl.setAngle(175);
		}
		public void rightOn()
		{
			servr.setAngle(200);
		}
		public void leftOff()
		{
			servl.setAngle(60);
		}
		public void rightOff()
		{
			servr.setAngle(145);
		}
	

}
