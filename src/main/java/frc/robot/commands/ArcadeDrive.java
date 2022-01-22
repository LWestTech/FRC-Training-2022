package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.subsystems.Drivetrain;

public class ArcadeDrive extends CommandBase {
    private final Drivetrain m_subsystem;

    public ArcadeDrive(Drivetrain Drivetrain){
        m_subsystem = Drivetrain;
        addRequirements(Drivetrain);
    }
    @Override
    public void initialize() {}

    @Override
    public void execute() {
        Robot.drivetrain.setLeftSpeed(((-1*(Robot.joystick.getRawAxis(1)))/4 + (Robot.joystick.getRawAxis(0))/4)/* * mult*/);
        Robot.drivetrain.setRightSpeed(((-1*(Robot.joystick.getRawAxis(1)))/4 - (Robot.joystick.getRawAxis(0))/4)/* * mult*/);
    }

    @Override
    public void end(boolean interrupted) {
        Robot.drivetrain.setRightSpeed(0);
        Robot.drivetrain.setLeftSpeed(0);
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }
}
