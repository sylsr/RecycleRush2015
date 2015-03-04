package org.usfirst.frc.team1891.robot;
import edu.wpi.first.wpilibj.Servo;
public class ServoMaster extends ServoSlave{
	public void on() {
		servl.setAngle(60);
		servr.setAngle(145);
	}
		public void reset() {
		servl.setAngle(175);
		servr.setAngle(20);
		}
	

}
