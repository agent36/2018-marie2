package org.usfirst.frc.team4931.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team4931.robot.RobotMap;

public class Lift extends Subsystem {

  private static final double kP_real = 4;
  private static final double kI_real = 0.07;
  private WPI_TalonSRX liftMotor;
  private AnalogPotentiometer potentiometer;


  public Lift() {
//    super(kP_real, kI_real, 0);
//    setAbsoluteTolerance(0.005);
    liftMotor = new WPI_TalonSRX(RobotMap.liftMotorPort);
    potentiometer = new AnalogPotentiometer(2, -2.0 / 5);
    addChild("Motor", liftMotor);
    addChild("Potentiometer", potentiometer);
  }

  @Override
  protected void initDefaultCommand() {
    // TODO Auto-generated method stub

  }

  public void log() {
    SmartDashboard.putData("Lift Potentiometer", (AnalogPotentiometer) potentiometer);
  }

//  @Override
//  protected double returnPIDInput() {
//    return potentiometer.get();
//  }

//  @Override
//  protected void usePIDOutput(double power) {
//    liftMotor.set(power);
//  }
  
  public void setLiftHeight(FixedLiftHeight liftHeight) {
    switch (liftHeight) {
      case EXCHANGE:
        //TODO:
        break;
      case SCALE_MID:
        //TODO
        break;
      case FLOOR:
        //TODO
        break;
      case SCALE_TOP:
        //TODO
        break;
      case SWITCH:
        //TODO
        break;
    }
  }
}
