// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ShooterBaseSubsystem;

public class ShotCommand extends CommandBase {
  private final ShooterBaseSubsystem subsystem;

  /** Creates a new ShotCommand. */
  public ShotCommand(ShooterBaseSubsystem subsystem) {
    this.subsystem = subsystem;
    addRequirements(subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    subsystem.setNetworkRpm();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {

  }

  // Returns true when the command should end.
  // returns true when the rpm is reached
  @Override
  public boolean isFinished() {
    return subsystem.atSetpoint();
  }
}
