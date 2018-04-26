package org.usfirst.frc.team3218.robot.subsystems;

import java.awt.Point;

import org.usfirst.frc.team3218.robot.RobotMap;
import org.usfirst.frc.team3218.robot.commands.DriveTrain.CurrentPosition;
import org.usfirst.frc.team3218.robot.commands.DriveTrain.DriveWithJoystick;

import edu.wpi.first.wpilibj.ADXL345_I2C;
import edu.wpi.first.wpilibj.AnalogInput;
//import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.interfaces.Accelerometer;

/**
 *
 */
public class AccelAndGyro extends Subsystem {
    double currentVelocity = 0.0; 
    double currentPosition = new Double(0.0);
    public double pastTime = 0;
    public double pastXVelocity = 0;
    public double pastYVelocity = 0;
    public double yPosition = 0;
    public double xPosition = 0;
    public double gyroPast=0;
  
    
    //Gyro gyro = new Gyro(RobotMap.gyroPort);
	//Accelerometer accel = new ADXL345_I2C(I2C.Port.kOnboard, Accelerometer.Range.k4G);

	public void initDefaultCommand() {
    	setDefaultCommand(new CurrentPosition());
    }
	public void getGyro() {
		//return gyro.getAngle();
	}
	public void gyroRest(){
		//gyro.reset();
		
	}
	public void getAccelerometerX() {
		//return accel.getX();
	}
	public void getAccelerometerY() {
	//	return accel.getY();
	}
	public double getCurrentVelocity() {
		return currentVelocity;
	}
	public void setCurrentVelocity(Double x) {
		 currentVelocity = x;
	}
	public double getCurrentXPosition() {
		return xPosition;
	}	
	public double getCurrentYPosition(){
		return yPosition;
	}
	public void setCurrentPosition(Double p) {
		currentPosition = p;
	}
	public Double getCurrentTime(){
		return 0.0;
	}
}
