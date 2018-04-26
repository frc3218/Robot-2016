package org.usfirst.frc.team3218.robot.commands.BallCollection;

import org.usfirst.frc.team3218.robot.Robot;
import org.usfirst.frc.team3218.robot.subsystems.BallCollection;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class UnJam extends Command {

    public UnJam() {
        requires(Robot.ballCollection);
    	setTimeout(.75);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.ballCollection.Unjam();
    	Robot.ballShooter.upperReverse();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	
    }
}
