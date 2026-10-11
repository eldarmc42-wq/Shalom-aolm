package frc.robot.commands;

import com.spikes2212.command.genericsubsystem.commands.MoveGenericSubsystem;
import frc.robot.subsystems.UMamaSoFat;

public class UMamaSoBig extends MoveGenericSubsystem {

    public UMamaSoBig(UMamaSoFat fatMama, double speed) {
        super(fatMama, speed);
        addRequirements(fatMama);
    }
}
