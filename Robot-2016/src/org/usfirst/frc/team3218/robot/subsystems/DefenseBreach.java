package org.usfirst.frc.team3218.robot.subsystems;


import org.usfirst.frc.team3218.robot.RobotMap;
import org.usfirst.frc.team3218.robot.commands.DefenseBreachingArm.DefenseBreachOff;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DefenseBreach extends Subsystem {
    
	
	
	
	SpeedController defenseBreacher = new Talon(RobotMap.defenseBreachingArmPort);

	public DigitalInput defenseLimit = new DigitalInput(RobotMap.defenseLimitSwitch);
	
   public double max = 0;
    public double collectionHeight = 0;
    public double flipV =0;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	//public DefenceBreach(){}

    public void initDefaultCommand() {
    	setDefaultCommand(new DefenseBreachOff());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void armDrive(double speed){
    	defenseBreacher.set(speed);
    }
   
    
   
    public void off(){
    	defenseBreacher.set(0);
    }
	public void up(){
		if(!defenseLimit.get())
		defenseBreacher.set(-.9);
	}
	public void down(){
		defenseBreacher.set(.9);
	}

}    
    
