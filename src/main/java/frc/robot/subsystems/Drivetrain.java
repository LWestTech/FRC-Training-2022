// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.*;

public class Drivetrain extends SubsystemBase {

  private CANSparkMax leftMotor = new CANSparkMax(5, CANSparkMaxLowLevel.MotorType.kBrushless);
  private CANSparkMax rightMotor = new CANSparkMax(4, CANSparkMaxLowLevel.MotorType.kBrushless);

  public void setLeftSpeed (double leftSpeed){
    leftMotor.set(leftSpeed);
  }

  public void setRightSpeed (double rightSpeed){
    rightMotor.set(rightSpeed);
  }
  /** Creates a new Drivetrain. */
  public Drivetrain() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
