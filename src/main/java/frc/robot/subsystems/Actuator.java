/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;;

/**
 * Add your docs here.
 */
public class Actuator extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  Solenoid act1 = new Solenoid(RobotMap.sol1);
  DoubleSolenoid doubleAct2 = new DoubleSolenoid(RobotMap.sol2, RobotMap.sol3);

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void extend() {
    act1.set(RobotMap.on);

  }
  public void release() {
    act1.set(RobotMap.off);
  
  }

  public void actForward() {
    doubleAct2.set(Value.kForward);
  
  }

  public void actBack() {
    doubleAct2.set(Value.kReverse);

  }
}
