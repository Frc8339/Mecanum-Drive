// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;
//Connect the drivesubsytem to this command so we can use their variables attached to methods
import frc.robot.subsystems.DriveSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class HalveDriveSpeed extends CommandBase {
  //Declaration of the variable within the HalveDriveSpeed  command
  private final DriveSubsystem m_drive;

  //This is just connecting the m_drive within this folder.
  public HalveDriveSpeed(DriveSubsystem drive) {
    m_drive = drive;
  }

  //Once the command is initialised, the max output is constrained to about 0.5 of the maximum speed.
  //This will give you more control at the expense of speed
  //@Override
  //public void initialize() {
    //m_drive.setMaxOutput(0.5);
 // }
  //This little guy interrupts the entire command, without this if you pressed the button to start the command
  //it would never end, even if you let go of the button activating the function. 
  //We would use the operator boolean because it means yes or no, then we would use a variable to represent it
  //@Override
  //public void end(boolean interrupted) {
    //m_drive.setMaxOutput(1);
 // }
}
