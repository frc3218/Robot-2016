package org.usfirst.frc.team3218.robot.commands.DriveTrain;

import org.usfirst.frc.team3218.robot.Robot;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Drive extends Command {
public double timeOut;
public double speed;
    public Drive(double time, double speed) {
    	this.timeOut = time;
    	this.speed = speed;
    	requires(Robot.driveTrain);
    	setTimeout(timeOut);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.driveTrain.drive(speed,0);
    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
