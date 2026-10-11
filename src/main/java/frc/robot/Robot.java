package frc.robot;

import com.spikes2212.util.smartmotorcontrollers.TalonFXWrapper;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import frc.robot.commands.Lahovil;
import frc.robot.subsystems.Hovala;

public class Robot extends TimedRobot {

    Lahovil lahovil;
    Lahovil lahovilYotar;

    @Override
    public void robotInit() {
        MotorController motorController = new TalonFXWrapper(RobotMap.CAN.THE_GREAT_MOVIL);
        Hovala hovala = new Hovala(motorController);
        lahovil = new Lahovil(hovala, 0.1);
        lahovilYotar = new Lahovil(hovala, 0.2);
    }

    @Override
    public void robotPeriodic() {
        CommandScheduler.getInstance().run();
    }

    @Override
    public void disabledInit() {
        CommandScheduler.getInstance().cancelAll();
    }

    @Override
    public void autonomousInit() {
        CommandScheduler.getInstance().schedule(lahovil);
    }

    @Override
    public void autonomousExit() {
        CommandScheduler.getInstance().cancel(lahovil);
    }

    @Override
    public void teleopInit() {
        CommandScheduler.getInstance().schedule(lahovilYotar);
    }

    @Override
    public void teleopExit() {
        CommandScheduler.getInstance().cancel(lahovilYotar);
    }

    @Override
    public void testInit() {
        CommandScheduler.getInstance().cancelAll();
    }

}
