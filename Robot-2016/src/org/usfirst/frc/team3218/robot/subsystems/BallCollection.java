package org.usfirst.frc.team3218.robot.subsystems;

import org.usfirst.frc.team3218.robot.Robot;
import org.usfirst.frc.team3218.robot.RobotMap;
import org.usfirst.frc.team3218.robot.commands.BallCollection.BallCollectionOff;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class BallCollection extends Subsystem {
	
	SpeedController ballCollector =new Talon(RobotMap.ballCollectionMotorPort);
	// Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
       setDefaultCommand(new BallCollectionOff());
    	// Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void BallCollectionOff(){
    	ballCollector.set(0);
    }
   public void BallCollectionOn(){
	   ballCollector.set(1);
   }
   
   public void Unjam(){
	   ballCollector.set(-0.75);
   }
   public void Reverse(){
	   ballCollector.set(-1);
   }

}

