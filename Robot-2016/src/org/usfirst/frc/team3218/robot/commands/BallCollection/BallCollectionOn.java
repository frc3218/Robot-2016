package org.usfirst.frc.team3218.robot.commands.BallCollection;

import org.usfirst.frc.team3218.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class BallCollectionOn extends Command {

    public BallCollectionOn() {
    	 requires(Robot.ballCollection);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.ballCollection.BallCollectionOn();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;//Robot.ballCollection.hasBall();
    }

    // Called once after isFinished returns true
    protected void end() {
   new UnJam().start();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	 new UnJam().start();
    }
}
