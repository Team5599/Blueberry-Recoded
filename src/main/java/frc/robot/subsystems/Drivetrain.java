// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
// import com.revrobotics.CANSparkMaxLowLevel;
// import com.revrobotics.RelativeEncoder;

public class Drivetrain extends SubsystemBase {
  //need to change deviceID later
  private final CANSparkMax FL = new CANSparkMax(0, CANSparkMax.MotorType.kBrushed);
  private final CANSparkMax FR = new CANSparkMax(0, CANSparkMax.MotorType.kBrushed);
  private final CANSparkMax BL = new CANSparkMax(0, CANSparkMax.MotorType.kBrushed);
  private final CANSparkMax BR = new CANSparkMax(0, CANSparkMax.MotorType.kBrushed);

  private final MotorControllerGroup leftMotors = new MotorControllerGroup(FL, BL);
  private final MotorControllerGroup rightMotors = new MotorControllerGroup(FR, BR);

  // private final RelativeEncoder encoderFL = FL.getEncoder();
  // private final RelativeEncoder encoderFR = FR.getEncoder();
  // private final RelativeEncoder encoderBL = BL.getEncoder();
  // private final RelativeEncoder encoderBR = BR.getEncoder();


  /** Creates a new Drivetrain. */
  public Drivetrain() {
    FL.restoreFactoryDefaults();
    BL.restoreFactoryDefaults();
    FR.restoreFactoryDefaults();
    BR.restoreFactoryDefaults();

    // encoderFL.setPosition(0);
    // encoderBL.setPosition(0);
    // encoderFR.setPosition(0);
    // encoderBR.setPosition(0);
  }
  

  public void tankDrive(double leftSpeed, double rightSpeed){
     leftMotors.set(leftSpeed);
     rightMotors.set(rightSpeed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
