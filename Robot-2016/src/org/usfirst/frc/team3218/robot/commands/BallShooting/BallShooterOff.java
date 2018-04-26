package org.usfirst.frc.team3218.robot.commands.BallShooting;

import org.usfirst.frc.team3218.robot.Robot;
import org.usfirst.frc.team3218.robot.subsystems.BallShooter;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class BallShooterOff extends Command {

    public BallShooterOff() {
      requires(Robot.ballShooter);
    	// Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    Robot.ballShooter.off();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}