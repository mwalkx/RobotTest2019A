/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.buttons.*;

import frc.robot.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());

  //Joystick joystick0 = new Joystick(0);
  static XboxController xb1 = new XboxController(0);

//  Button buttonA = new JoystickButton(xb1, 1);
  
  static Button buttonB = new JoystickButton(xb1, 2);
  static Button leftBumper = new JoystickButton(xb1, 5);
  static Button rightBumper = new JoystickButton(xb1, 6);


  

  // Button jbutton1 = new JoystickButton(joystick0, 1);

  public OI() {
    // constructor to set up buttons and actions
    // jbutton1.whenPressed(new DriveIt());

    // buttonA.whenPressed(new OpenActuator(true));
    if(xb1.getAButtonPressed()) {
      new OpenActuator(true);
    }
  
    buttonB.whenPressed(new OpenActuator(false));
    


  }

  public static double getXBXL() {
    return xb1.getX(Hand.kLeft);
  }

  public static double getXBXR() {
    return xb1.getX(Hand.kRight);
  }
}
