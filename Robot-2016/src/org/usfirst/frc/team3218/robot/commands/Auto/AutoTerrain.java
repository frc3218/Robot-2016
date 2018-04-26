package org.usfirst.frc.team3218.robot.commands.Auto;

import org.usfirst.frc.team3218.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoTerrain extends Command {

	    public AutoTerrain() {
	    	requires(Robot.driveTrain);
	    	setTimeout(2.8);
	    } 

	    protected void initialize() {
	    }

	    protected void execute() {
	    	Robot.driveTrain.drive(-0.8, 0);
	    }

	    protected boolean isFinished() {
	        return isTimedOut();
	    }

	    protected void end() {
	    	
	    }

	    protected void interrupted() {
	    }
	}
