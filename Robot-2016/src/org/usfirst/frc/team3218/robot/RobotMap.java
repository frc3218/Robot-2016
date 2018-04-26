package org.usfirst.frc.team3218.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	//JoystickButtons
    public static int trigger = 1;
    public static int button2 = 2;
    public static int button3 = 3;
    public static int button4 = 4;
    public static int button5 = 5;
    public static int button6 = 6;
    public static int button7 = 7;
    public static int button8 = 8;
    public static int button9 = 9;
    public static int button10 = 10;
    public static int button11 = 11;
    public static int button12 = 12;
    public static int button13 = 13;
    public static int button14 = 14;
    
    /*
     * Motor Ports
     * Limited to 0-9 PWM & 0-3 Relay
    */
    //Vision
  //  public static int light = 1;//RELAY
    //Drive Motors
    public static int frontLeftDriveMotorPort =3 ;//PWM
    public static int rearLeftDriveMotorPort = 4;//PWM
    public static int frontRightDriveMotorPort = 2;//PWM
    public static int rearRightDriveMotorPort = 1;//PWM
    //Defense Breaching Arm Motors
    public static int defenseBreachingArmPort = 0;//PWM
   
    //Ball Shooting Motorss
    public static int upperShootingMotorPort = 8;//PWM
    public static int lowerShootingMotorPort = 7;//PWM
     //Ball Collection Motors
    public static int ballCollectionMotorPort=9;//PWM
    //Climbing Motors
    public static int BlowerPort=0;//Relay
    public static int WinchMotorPort1 = 5;//PWM
    public static int WinchMotorPort2 = 6;//PWM
    /*
     * Sensor Ports\
     * Limited to 0-9 DIO & 0-3 Analog 
     */
    //Drive Train Based Sensors
  //  public static int gyroPort = 0;//Analog
    //Defense Breaching Based Sensors
    public static int defenseLimitSwitch=0;
    public static int defenseEncoderA=1;//DIO
    public static int defenseEncoderB=2;//DIO
    //Ball Shooter Based Sensors
  
    //Ball Collection Based Sensors
    public static int hasBallSensorPort = 7;//DIO
    //Climbing Based Sensors
  
}