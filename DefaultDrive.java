// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;
import frc.robot.subsystems.DriveSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;
import java.util.function.DoubleSupplier;

/**
 * A command to drive the robot with joystick input (passed in as {@link DoubleSupplier}s). Written
 * explicitly for pedagogical purposes - actual code should inline a command this simple with {@link
 * edu.wpi.first.wpilibj2.command.RunCommand}.
 */
public class DefaultDrive extends CommandBase {
  private final DriveSubsystem m_drive;
  //private final DoubleSupplier m_forward;
  private final DoubleSupplier m_rotation;
  private final DoubleSupplier m_xSpeed;
  private final DoubleSupplier m_ySpeed;

  /**
   * Creates a new DefaultDrive.
   *
   * @param subsystem The drive subsystem this command will run on.
   * The control input for driving forwards/backwards
   * @param rotation The control input for turning
   * @param xSpeed
   * @param ySpeed
   */
  public DefaultDrive(DriveSubsystem subsystem, DoubleSupplier xSpeed, DoubleSupplier ySpeed, DoubleSupplier rotation) {
    m_drive = subsystem;
    m_xSpeed = xSpeed;
    m_ySpeed = ySpeed;
    m_rotation = rotation;
    addRequirements(m_drive);
  }
  
  //This executes when the code starts up, this function gets the rotation and the forward movemnt.
  //Note the Constants.STEERING_SENSE, This limits the steering s
  @Override
  public void execute() {
    m_drive.driveCartesian(m_xSpeed.getAsDouble(), m_rotation.getAsDouble(), m_ySpeed.getAsDouble());
  }
}
