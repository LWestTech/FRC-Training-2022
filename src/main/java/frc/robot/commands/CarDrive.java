package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.subsystems.Drivetrain;

public class CarDrive extends CommandBase{
    private final Drivetrain m_subsystem;
    private double Gas;
    private double Steering;

    public CarDrive(Drivetrain Drivetrain) {
        m_subsystem = Drivetrain;
        addRequirements(Drivetrain);
    }

    @Override
    public void initialize() {
        Gas = Robot.controllerHandler(3); //TODO: Find the correct axis
        Steering = Robot.controllerHandler(2);

        Robot.drivetrain.setLeftSpeed(Gas + Steering);
        Robot.drivetrain.setLeftSpeed(Gas - Steering);
        end(false);
    }

    @Override
    public void execute(){

    }

    @Override
    public void end(boolean interrupted) {
        Robot.drivetrain.setRightSpeed(0);
        Robot.drivetrain.setLeftSpeed(0);
    }

    @Override
    public boolean isFinished(){return false;}
}