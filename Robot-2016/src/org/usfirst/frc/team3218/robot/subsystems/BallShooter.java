package org.usfirst.frc.team3218.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team3218.robot.RobotMap;
import org.usfirst.frc.team3218.robot.commands.BallShooting.BallShooterOff;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
/**
 *
 */
public class BallShooter extends Subsystem {
	
	SpeedController upperMotor=new Talon(RobotMap.upperShootingMotorPort);
    SpeedController lowerMotor=new Talon(RobotMap.lowerShootingMotorPort);
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
       setDefaultCommand(new BallShooterOff());
    	// Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void off(){
    	upperMotor.set(0);
    	lowerMotor.set(0);
    }
	public void revUp(){
		lowerMotor.set(-1);
		upperMotor.set(1);
	}
    public void on(){
		upperMotor.set(1);
		lowerMotor.set(-1);
    }
    public void upperReverse(){
    	upperMotor.set(-0.5);
    }
	public void upperOn(){
		upperMotor.set(.5);
	}
}

