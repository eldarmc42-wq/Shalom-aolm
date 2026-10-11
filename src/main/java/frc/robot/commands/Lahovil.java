package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Hovala;

public class Lahovil extends Command {

    Hovala movil;
    double speed;

    public Lahovil(Hovala movil, double speed) {
        addRequirements(movil);
        this.movil = movil;
        this.speed = speed;
    }

    @Override
    public void initialize() {
        System.out.println("fuck you jetbrains");
    }

    @Override
    public void execute() {
        movil.setSpeed(speed);
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end(boolean interrupted) {
        movil.stop();
    }
}
