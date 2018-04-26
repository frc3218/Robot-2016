package org.usfirst.frc.team3218.robot.commands.DriveTrain;

import org.usfirst.frc.team3218.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RotateRight extends Command {

    public RotateRight() {
    	requires(Robot.driveTrain);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.driveTrain.drive(0,-1);
    }

    protected boolean isFinished() {
    	return false;
      //  return Robot.accelAndGyro.getGyro() == 90;
    }

    protected void end() {
    	
    }

    protected void interrupted() {
    }
}
