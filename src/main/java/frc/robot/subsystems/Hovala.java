package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Hovala extends SubsystemBase {

    MotorController motorController;

    public Hovala(MotorController motorController) {
        this.motorController = motorController;
    }

    public void setSpeed(double speed) {
        motorController.set(speed);
    }

    public void stop() {
        motorController.stopMotor();
    }
}
