package org.usfirst.frc.team3218.robot.commands.ClimbingArm;

import org.usfirst.frc.team3218.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class ClimbingOff extends Command {

    public ClimbingOff() {
    	requires(Robot.climbingArm);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.climbingArm.climbingOff();
    	
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
