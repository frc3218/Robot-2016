package org.usfirst.frc.team3218.robot.commands.DriveTrain;

import org.usfirst.frc.team3218.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ReverseDrive extends Command {

    public ReverseDrive() {
    	requires(Robot.driveTrain);
    	setTimeout(1);
    }

    protected void initialize() {
    }

    protected void execute() {
    //	Robot.driveTrain.drive(-1, 0);
    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
