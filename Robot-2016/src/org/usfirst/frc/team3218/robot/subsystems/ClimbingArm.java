package org.usfirst.frc.team3218.robot.subsystems;

import org.usfirst.frc.team3218.robot.RobotMap;
import org.usfirst.frc.team3218.robot.commands.ClimbingArm.ClimbingOff;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ClimbingArm extends Subsystem {
    
	Relay blower = new Relay(RobotMap.BlowerPort);
    SpeedController winch1 = new Talon(RobotMap.WinchMotorPort1);  
    SpeedController winch2 = new Talon(RobotMap.WinchMotorPort2);  
    public void initDefaultCommand() {
    	setDefaultCommand(new ClimbingOff());
    }
    public void climbingOff(){
    	blower.set(Relay.Value.kOff);
    	winch1.set(0);
    	winch2.set(0);
    }
    public void blowerOn(){
    	blower.set(Relay.Value.kForward);
    	
	} 
    public void winchOn(){
    	winch1.set(.5);
    	winch2.set(.5);
	}   
    
   
}