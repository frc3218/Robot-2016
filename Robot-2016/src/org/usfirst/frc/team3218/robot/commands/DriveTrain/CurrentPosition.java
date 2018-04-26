package org.usfirst.frc.team3218.robot.commands.DriveTrain;

import org.usfirst.frc.team3218.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class CurrentPosition extends Command {

    public CurrentPosition() {
        requires(Robot.accelAndGyro);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    
    protected void execute() {
    	/*
    	double deltaGyro = Robot.accelAndGyro.getGyro()-Robot.accelAndGyro.gyroPast;
    	double currentTime = Robot.elapsedTime.get();
    	double deltaTime = currentTime - Robot.accelAndGyro.pastTime;
    	double currentYVelocity = Robot.accelAndGyro.getAccelerometerY() * deltaTime;
    	double yDisplacement = currentYVelocity * deltaTime * Math.cos(deltaGyro);
        Robot.accelAndGyro.yPosition = yDisplacement + Robot.accelAndGyro.yPosition;
        double xDisplacement = Math.tan(deltaGyro) * yDisplacement;
        Robot.accelAndGyro.xPosition = xDisplacement + Robot.accelAndGyro.xPosition;
    	Robot.accelAndGyro.pastYVelocity = currentYVelocity;
    	double pastTime = currentTime;
    	Robot.accelAndGyro.xPosition = Robot.accelAndGyro.xPosition + Robot.accelAndGyro.getAccelerometerX() * deltaTime * deltaTime;
    	Robot.accelAndGyro.gyroPast = Robot.accelAndGyro.getGyro();
    	*/
    	
    	
    	
    	
    	//double yDisplacement = Robot.accelAndGyro.getAccelerometerY()*deltaTime*deltaTime + yDisplacement;
    	//double xDisplacement = Robot.accelAndGyro.getAcceletometerX()*deltaTime*deltaTime + xDisplacement;
    	//
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns trues
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
