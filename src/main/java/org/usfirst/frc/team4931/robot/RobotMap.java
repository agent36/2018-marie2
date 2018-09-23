package org.usfirst.frc.team4931.robot;

import org.usfirst.frc.team4931.robot.enums.Gear;
import org.usfirst.frc.team4931.robot.enums.GrabberPosition;
import org.usfirst.frc.team4931.robot.enums.GrabberState;

public enum RobotMap {

  // todo: Add real values

  /* Input */
  JOYSTICK(0),

  DRIVETRAIN_SHIFT_GEAR_TOOGLE(1),

  GRABBER_TOOGLE(2),

  /* FIXME: USE REAL JOYSTICK TO FIND INPUTS */
  GRABBER_POSITION_FORWARD_DOWN(1),
  GRABBER_POSITION_FORWARD_STRAIGHT(2),
  GRABBER_POSITION_FORWARD_SWITCH(3),
  GRABBER_POSITION_VERTICAL(4),
  GRABBER_POSITION_BACK_SWITCH(5),
  GRABBER_POSITION_BACKWARD_STRAIGHT(6),
  GRABBER_POSITION_BACKWARD_DOWN(7),

  /* Motors */
  MOTOR_DT_FRONT_LEFT(3),
  MOTOR_DT_FRONT_RIGHT(1),
  MOTOR_DT_BACK_LEFT(4),
  MOTOR_DT_BACK_RIGHT(2),

  MOTOR_GRABBER(7),

  /* Grabber Config */

  /* The maximum distance the grabber can go to*/
  GRABBER_CONFIG_POSITION_MAX(2276),

  /* The travel speed of the grabber in distance per 100 milliseconds */
  GRABBER_CONFIG_CRUISE_VELOCITY(RobotMap.GRABBER_CONFIG_POSITION_MAX.getValue() / 10),

  /* Figure out this some other time */
  GRABBER_CONFIG_ACCELERATION(RobotMap.GRABBER_CONFIG_POSITION_MAX.getValue() / 3 / 10),

  /* Pneumatic */
  COMPRESSOR(6),

  /* GearBox */
  GEARBOX_1(1),
  GEARBOX_2(0),

  /* Grabber */
  GRABBER_1(2),
  GRABBER_2(3);

  public static GrabberPosition defaultGrabberPosition = GrabberPosition.VERTICAL;
  public static GrabberState defaultGrabberState = GrabberState.OPENED;
  public static Gear defaultGear = Gear.LOW;

  private int value;

  RobotMap(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }
}
