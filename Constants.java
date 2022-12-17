// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static final class DriveConstants {
    
}

  public static final class OIConstants {
    public static final int kDriverControllerPort = 0;
  }

public static final int FRONT_LEFT = 1;
public static final int BACK_LEFT = 2;
public static final int BACK_RIGHT = 4;
public static final int FRONT_RIGHT = 3;

//This makes the steering sensitivity approx 75% of it's maximum output.
//This is attached to the default drive command, so you can really edit this to whatever your preference is
//However make sure to realise that you will be competing on a carpet like material, so it will differ.
//public static final double STEERING_SENSE = 0.75;
}
