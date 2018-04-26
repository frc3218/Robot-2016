package org.usfirst.frc.team3218.robot.subsystems;


import org.usfirst.frc.team3218.robot.Robot;
import org.usfirst.frc.team3218.robot.RobotMap;
import org.usfirst.frc.team3218.robot.commands.DriveTrain.DriveWithJoystick;

import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.interfaces.Accelerometer;

/**
 *
 */
public class DriveTrain extends Subsystem {
	 RobotDrive robotdrive = new RobotDrive(
	    		RobotMap.frontLeftDriveMotorPort, 
	    		RobotMap.rearLeftDriveMotorPort, 
	    		RobotMap.frontRightDriveMotorPort, 
	    		RobotMap.rearRightDriveMotorPort);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        setDefaultCommand(new DriveWithJoystick());
    }
    public void drive(double y, double x) {
    	robotdrive.arcadeDrive(-y, -x);
    }

}