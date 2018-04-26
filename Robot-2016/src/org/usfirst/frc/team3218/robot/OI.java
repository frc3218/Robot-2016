package org.usfirst.frc.team3218.robot;


import org.usfirst.frc.team3218.robot.commands.BallCollection.*;
import org.usfirst.frc.team3218.robot.commands.BallShooting.*;
import org.usfirst.frc.team3218.robot.commands.ClimbingArm.*;
import org.usfirst.frc.team3218.robot.commands.DefenseBreachingArm.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public static Joystick joystick = new Joystick(0);
	public static Button trigger = new JoystickButton(joystick, RobotMap.trigger);
	public static Button button2 = new JoystickButton(joystick, RobotMap.button2);
	public static Button button3 = new JoystickButton(joystick, RobotMap.button3);
	public static Button button4 = new JoystickButton(joystick, RobotMap.button4);
	public static Button button5 = new JoystickButton(joystick, RobotMap.button5);
	public static Button button6 = new JoystickButton(joystick, RobotMap.button6);
	public static Button button7 = new JoystickButton(joystick, RobotMap.button7);
	public static Button button8 = new JoystickButton(joystick, RobotMap.button8);
	public static Button button9 = new JoystickButton(joystick, RobotMap.button9);
	public static Button button10 = new JoystickButton(joystick, RobotMap.button10);
	public static Button button11 = new JoystickButton(joystick, RobotMap.button11);
	public static Button button12 = new JoystickButton(joystick, RobotMap.button12);	
	public static Button button13 = new JoystickButton(joystick, RobotMap.button13);	
	public static Button button14 = new JoystickButton(joystick, RobotMap.button14);	
	
	
	public OI(){
		trigger.whenPressed(new ShootingCommandGroup());
		button2.whileHeld(new BallCollectionOn());		
		button3.whenPressed(new BallShooterOn());
		button4.whileHeld(new BallCollectionReverse());
		button5.whileHeld(new BallFeed());
		button8.whileHeld(new UnJam());
		button9.toggleWhenPressed(new BlowerOn());
		button10.whileHeld(new WinchOn());
		button11.whileHeld(new DefenseBreachDown());
		button12.whileHeld(new DefenseBreachUp());
	}
	
	public double getJoystickX(){
		return joystick.getX();
	}
	public double getJoystickY(){
		return joystick.getY();
	}
	
}

