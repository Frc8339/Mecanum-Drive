// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase {
  // The motors on the left side of the drive.
  //This is from the MotorController group, PLEASE READ THE DOCUMENTATION.
  WPI_VictorSPX m_frontLeft = new WPI_VictorSPX(Constants.FRONT_LEFT);
  WPI_VictorSPX m_backLeft = new WPI_VictorSPX(Constants.BACK_LEFT);
  
  
  // The motors on the right side of the drive  
  //You see the constants in the  brackets. Usually you would put the port your would plug these specific motors into
  //But I wanted to be organised, So I attached the constant file and just put all of them there, so they're in one place.
  WPI_VictorSPX m_frontRight = new WPI_VictorSPX(Constants.FRONT_RIGHT);
  WPI_VictorSPX m_backRight = new WPI_VictorSPX(Constants.BACK_RIGHT);

  // The robot's drive, you would input the motor controllers into this.
  //This allows you to put the motor controllers in to the arcade drive method.
  //For this to work you need to make sure that you use two motors.
  //It won't allow for just one  motor because that's not how the differential drive constructer is set up.
  //If you have  more than two motors, then you need to put them into motor controller group, then attach 
  //them to the differential drive method.
  private final MecanumDrive m_drive = new MecanumDrive(m_frontLeft, m_backLeft, m_frontRight, m_backRight);
  
  /** Creates a new DriveSubsystem. */
  public DriveSubsystem() {
    // We need to invert one side of the drivetrain so that positive voltages
    // result in both sides moving forward. Depending on how your robot's
    // gearbox is constructed, you might have to invert the left side instead.
   
  } 

  
  /**
   * Drives the robot using arcade controls.
   *
   * @param xSpeed the commanded forward movement
   * @param rot the commanded rotation
   * @param ySpeed
   */
  
  public void driveCartesian(double xSpeed, double ySpeed, double rot){
    m_drive.driveCartesian(xSpeed, ySpeed, rot);
  }

  /**
   * Sets the max output of the drive. Useful for scaling the drive to drive more slowly.
   *
   * @param maxOutput the maximum output to which the drive will be constrained
   * This limits the motors to a specific voltage output,, this is useful for the halfdrivespeed command
   */
  //public void setMaxOutput(double maxOutput) {
    //m_drive.setMaxOutput(maxOutput);
  //}

}
