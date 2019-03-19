/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.*;

import frc.robot.util.JoystickController;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    public JoystickController j0;
    public JoystickController j1;

    public OI() {
        j0 = new JoystickController(0);
        j1 = new JoystickController(1);

        j1.b1.whileHeld(new RunIntake());
        j1.b2.whileHeld(new RunOuttake());

        j1.b3.whileHeld(new LowerLift());
        j1.b4.whileHeld(new RaiseLift());

        j0.b3.whenPressed(new GrabHatch());
        j0.b4.whenPressed(new ReleaseHatch());

        j0.b1.whenPressed(new ToggleExtend());
    }
}
