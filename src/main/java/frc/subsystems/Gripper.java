/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class Gripper extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void intake()
  {
    System.out.println("intaking");
      set(-0.75);
  }

  public void outtake()
  {
    System.out.println("outtaking");
      set(0.75);
  }

  public void stop()
  {
    RobotMap.bothSidesIntake.stopMotor();
  }

  private void set(double speed)
  {
    RobotMap.bothSidesIntake.set(speed);
  }
}
