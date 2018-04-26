package org.usfirst.frc.team3218.robot.commands.ClimbingArm;

import org.usfirst.frc.team3218.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class WinchOn extends Command {

    public WinchOn() {
    	requires(Robot.climbingArm);    
    }

    protected void initialize() {
    	
    }

    protected void execute() {
    	Robot.climbingArm.winchOn();	
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
