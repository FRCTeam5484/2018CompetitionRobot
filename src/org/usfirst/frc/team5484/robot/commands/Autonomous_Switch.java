package org.usfirst.frc.team5484.robot.commands;

import org.usfirst.frc.team5484.robot.Robot;
import org.usfirst.frc.team5484.robot.subsystems.Lift;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Autonomous_Switch extends CommandGroup {
	
    public Autonomous_Switch() {
    	if(Robot.FieldSetup.charAt(0) == 'L')
    	{
	    	addParallel(new DriveTrain_DriveStraightForInches(.7, 60), 10);
	        addSequential(new Lift_MoveToPosition(Lift.Switch));
	        addSequential(new Intake_EjectCube(.5));
    	}
    	else
    	{
	        addSequential(new Lift_MoveToPosition(Lift.Switch));
	        addSequential(new DriveTrain_TurnToAngle(90));
	        addSequential(new DriveTrain_DriveStraightForInches(.7, 120));
	        addSequential(new DriveTrain_TurnToAngle(-90));
	        addParallel(new DriveTrain_DriveStraightForInches(.7, 30), 10);
	        addSequential(new DriveTrain_DriveStraightForInches(.7, 30));
	        addSequential(new Intake_EjectCube(.5));
    	}
    }
}
