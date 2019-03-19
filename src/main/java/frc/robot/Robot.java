/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.commands.RunIntake;
import frc.robot.commands.RunOuttake;
import frc.robot.sensors.Cameras;
import frc.subsystems.ArmExtender;
import frc.subsystems.DriveTrain;
import frc.subsystems.Gripper;
import frc.subsystems.HatchGrabber;
import frc.subsystems.Lift;

/**
 * This is a demo program showing the use of the RobotDrive class, specifically
 * it contains the code necessary to operate a robot with tank drive.
 */
public class Robot extends TimedRobot {

  public static OI oi;
  public static DriveTrain driveTrain;
  public static Lift lift;
  public static Gripper gripper;
  public static ArmExtender armExtender;
  public static HatchGrabber hatchGrabber;
  public static Cameras cameras;
  public static boolean isGrabbed;
  public static boolean isExtended;
  @Override
  public void robotInit() {
    RobotMap.init();
    driveTrain = new DriveTrain();
    lift = new Lift();
    gripper = new Gripper();
    armExtender = new ArmExtender();
    hatchGrabber = new HatchGrabber();
    cameras = new Cameras();
    isGrabbed = false;
    isExtended = false;
    oi = new OI();
  }

  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
    SmartDashboard.putNumber("Drive Buffer: ", driveTrain.buffer);
  }
  
 @Override
 public void autonomousPeriodic() {
    Scheduler.getInstance().run();
 }
}
