
package org.usfirst.frc.team3218.robot;

import org.usfirst.frc.team3218.robot.commands.ExampleCommand;
import org.usfirst.frc.team3218.robot.commands.Auto.AutoArmDown;
import org.usfirst.frc.team3218.robot.commands.Auto.AutoTerrain;
import org.usfirst.frc.team3218.robot.commands.DriveTrain.Drive;
import org.usfirst.frc.team3218.robot.subsystems.AccelAndGyro;
import org.usfirst.frc.team3218.robot.subsystems.BallCollection;
import org.usfirst.frc.team3218.robot.subsystems.BallShooter;
import org.usfirst.frc.team3218.robot.subsystems.ClimbingArm;
import org.usfirst.frc.team3218.robot.subsystems.DefenseBreach;
import org.usfirst.frc.team3218.robot.subsystems.DriveTrain;
import org.usfirst.frc.team3218.robot.subsystems.ExampleSubsystem;
import org.usfirst.frc.team3218.robot.subsystems.Vision;

import com.ni.vision.NIVision;

import edu.wpi.first.wpilibj.ADXL345_I2C;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DriverStation;

import edu.wpi.first.wpilibj.GyroBase;
import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.interfaces.Accelerometer;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	
	public static final ExampleSubsystem exampleSubsystem = new ExampleSubsystem();
	public static final BallShooter ballShooter = new BallShooter();
	public static final ClimbingArm climbingArm = new ClimbingArm();
	public static final DefenseBreach defenseBreach = new DefenseBreach();
	public static final DriveTrain driveTrain = new DriveTrain();
	public static final BallCollection ballCollection = new BallCollection();
	public static final AccelAndGyro accelAndGyro = new AccelAndGyro();
	public static final Vision vision = new Vision();
	public static final String C_ERR="Camera Failed At";
	public static OI oi;
	
    Command autonomousCommand;
    //SendableChooser autoChooser;
    Accelerometer accel;
    GyroBase gyro;
    public static Timer elapsedTime;
    

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	try{
    		NIVision.IMAQdxConfigureGrab(Robot.vision.session);
    	}catch(Exception e){
    		SmartDashboard.putString("RobotCErr", C_ERR + "ImageGrabConfig "+e.getMessage());
    	}
    	elapsedTime = new Timer();
    	elapsedTime.start();
		oi = new OI();
		//autoChooser = new SendableChooser();
		//autoChooser.addObject("Terrain Based", new AutoTerrain());
		
		
	
		
		//SmartDashboard.putData("Autonomous Mode Chooser", autoChooser);
       
        
		// instantiate the command used for the autonomous period
     
		autonomousCommand = new AutoArmDown();
		Robot.accelAndGyro.gyroRest();
    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
        
        // schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
        
    }
    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        SmartDashboard.putNumber("Velocity", accelAndGyro.getCurrentVelocity());
        SmartDashboard.putData(driveTrain);
        SmartDashboard.putData(ballCollection);
        SmartDashboard.putData(ballShooter);
        SmartDashboard.putData(climbingArm);
        SmartDashboard.putData(defenseBreach);
        SmartDashboard.putData(vision);
  
        
        
        
        
        
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
