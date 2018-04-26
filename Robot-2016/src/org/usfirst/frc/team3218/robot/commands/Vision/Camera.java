package org.usfirst.frc.team3218.robot.commands.Vision;

import org.usfirst.frc.team3218.robot.Robot;

import com.ni.vision.NIVision;
import com.ni.vision.NIVision.DrawMode;
import com.ni.vision.NIVision.Rect;
import com.ni.vision.NIVision.ShapeMode;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
/**
 *
 */
public class Camera extends Command {

    public Camera() {
    	requires(Robot.vision);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	try{
    	NIVision.IMAQdxGrab(Robot.vision.session, Robot.vision.frame, 0);
    	Rect rect = new Rect();
    	rect.height = 100;
    	rect.left = 100;
    	rect.top = 100;
    	rect.width = 100;
		NIVision.imaqDrawShapeOnImage(Robot.vision.frame, Robot.vision.frame, rect, DrawMode.DRAW_VALUE, ShapeMode.SHAPE_OVAL, 0.0f);
    	CameraServer.getInstance().setImage(Robot.vision.frame);
    	}catch(Exception e){
    		//DriverStation.reportError("Camera Failed at command (Camera Execute) "+e.getMessage(), true);
    		SmartDashboard.putString("CommandCErr", Robot.C_ERR + "Camera Execute "+e.getMessage());
    	}
    	
    }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
