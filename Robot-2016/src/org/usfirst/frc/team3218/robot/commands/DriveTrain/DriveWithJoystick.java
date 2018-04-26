package org.usfirst.frc.team3218.robot.commands.DriveTrain;

import org.usfirst.frc.team3218.robot.OI;
import org.usfirst.frc.team3218.robot.Robot;
import org.usfirst.frc.team3218.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveWithJoystick extends Command {

    public DriveWithJoystick() {
    	requires(Robot.driveTrain);
    }

    protected void initialize() {
    }

    protected void execute() {
    Robot.driveTrain.drive(Robot.oi.getJoystickY(), Robot.oi.getJoystickX());
    	
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
