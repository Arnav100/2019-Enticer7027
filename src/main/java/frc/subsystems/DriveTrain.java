/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.commands.TankDrive;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public double buffer;
  public DriveTrain()
  {
    buffer= 1.0;
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
     setDefaultCommand(new TankDrive());
  }

  public void drive()
  {
    buffer = (Robot.oi.j1.getRawAxis(3) + 1)/2;
    move(-Robot.oi.j0.getY()*buffer, -Robot.oi.j1.getY()*buffer);
  }

  public void move(double left, double right)
  {
    System.out.println("Left Speed: " + left);
    RobotMap.driveBase.tankDrive(left, right);
  }
  
  public void stop() 
  {
    RobotMap.driveBase.stopMotor();
  }

}
