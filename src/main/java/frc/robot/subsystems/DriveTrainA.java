/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import com.analog.adis16448.frc.ADIS16448_IMU;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.RobotMap;
import frc.robot.commands.*;

/**
 * Add your docs here.
 */
public class DriveTrainA extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  Spark leftSpark = new Spark(RobotMap.leftMotor);
  Spark rtSpark = new Spark(RobotMap.rightMotor);
  int testNum = 5;
  DifferentialDrive driveTrain = new DifferentialDrive(leftSpark, rtSpark);
  


  public void driveJoystick(double leftSpd, double rtSpd) {
    // drive robot
      driveTrain.tankDrive(leftSpd, rtSpd);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new DriveIt());
  }

  public void driveStop() {
    driveTrain.tankDrive(0, 0);
  }

  public void log() {
    // log data
    SmartDashboard.putNumber("Test Number", testNum);
  }
}
