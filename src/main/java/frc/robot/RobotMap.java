package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class RobotMap {
    public static PWMVictorSPX leftFront;
    public static PWMVictorSPX leftBack;
    public static PWMVictorSPX rightFront;
    public static PWMVictorSPX rightBack;

    public static PWMVictorSPX bothSidesIntake;

    public static PWMTalonSRX liftMotor;

    public static SpeedControllerGroup leftSide;
    public static SpeedControllerGroup rightSide;

    public static DifferentialDrive driveBase;

    public static Compressor compressor;
    public static DoubleSolenoid armExtend;
    public static DoubleSolenoid hatchGrab;
    public static void init()
    {
        leftFront = new PWMVictorSPX(1);
        leftBack = new PWMVictorSPX(0);
        rightFront = new PWMVictorSPX(3);
        rightBack = new PWMVictorSPX(2);

        leftFront.setInverted(true);
        rightFront.setInverted(true);

        bothSidesIntake = new PWMVictorSPX(4);
        bothSidesIntake.setInverted(true);

        liftMotor = new PWMTalonSRX(5);

        leftSide = new SpeedControllerGroup(leftFront, leftBack);
        rightSide = new SpeedControllerGroup(rightFront, rightBack);

        driveBase = new DifferentialDrive(leftSide, rightSide);
        compressor = new Compressor(50);
        armExtend = new DoubleSolenoid( 0, 1);
        hatchGrab = new DoubleSolenoid( 2, 3);

    }

}