package org.usfirst.frc.team3218.robot.subsystems;

import org.usfirst.frc.team3218.robot.Robot;
import org.usfirst.frc.team3218.robot.RobotMap;
import org.usfirst.frc.team3218.robot.commands.Vision.Camera;


import com.ni.vision.NIVision;
import com.ni.vision.NIVision.Image;
import java.lang.Math;
import java.util.Comparator;
import java.util.Vector;
import com.ni.vision.NIVision.ImageType;
import com.ni.vision.NIVision.ROI;
import com.ni.vision.NIVision.Rect;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.SampleRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.command.Subsystem;
public class Vision extends Subsystem {
	
	public int session;
    public Image frame;  
    public Image frameOff; 
    public Image binaryFrame; 
    public Image bufferFrameH;
    public Image bufferFrameS;
    public Image bufferFrameL;
    public NIVision.Range HUE_RANGE; 
	public NIVision.Range SAT_RANGE; 
	public NIVision.Range VAL_RANGE; 
	public int deg;
	public Vision(){
		super();
		init();
	}
	public void init(){
		try{
			session = NIVision.IMAQdxOpenCamera("cam0",
		           NIVision.IMAQdxCameraControlMode.CameraControlModeController);
		     frame =  NIVision.imaqCreateImage(NIVision.ImageType.IMAGE_RGB, 0);
		     frameOff =  NIVision.imaqCreateImage(NIVision.ImageType.IMAGE_RGB, 0);
		     binaryFrame = NIVision.imaqCreateImage(NIVision.ImageType.IMAGE_U8, 0);
		     bufferFrameH = NIVision.imaqCreateImage(NIVision.ImageType.IMAGE_U8, 0);
		     bufferFrameS = NIVision.imaqCreateImage(NIVision.ImageType.IMAGE_U8, 0);
		     bufferFrameL = NIVision.imaqCreateImage(NIVision.ImageType.IMAGE_U8, 0);
		     HUE_RANGE = new NIVision.Range(200, 255);	//Default hue range
		     SAT_RANGE = new NIVision.Range(100, 255);	//Default saturation range
		     VAL_RANGE = new NIVision.Range(100, 255);	//Default value range
			}catch (Exception e) {
				//DriverStation.reportError("Camera Failed At Vision Object Inistialization "+e.getMessage(), true);
				SmartDashboard.putString("ObjCErr", Robot.C_ERR + "Camera Init "+e.getMessage());
			}
	}
	
	//Relay lights = new Relay(RobotMap.light);
	public int getDegrees(){
	    return deg;
	}
	
	public void initDefaultCommand() {
    	setDefaultCommand(new Camera());
    }
    
}