package org.usfirst.frc.team5484.robot.commands;

import org.usfirst.frc.team5484.robot.Robot;
import org.usfirst.frc.team5484.robot.subsystems.Lift;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Autonomous_Scale_Right extends CommandGroup {

    public Autonomous_Scale_Right() {
    	if(Robot.FieldSetup.charAt(1) == 'L')
    	{
    		addParallel(new Lift_MoveToPosition(Lift.Switch),12);
    		addSequential(new DriveTrain_DriveStraightForInches(.7, 240));
    		addSequential(new DriveTrain_TurnToAngle(-88));
    		addSequential(new DriveTrain_DriveStraightForInches(.7, 184));
    		addSequential(new DriveTrain_TurnToAngle(90));    	
	        addSequential(new Lift_MoveToPosition(Lift.MidScale),12);
	        addSequential(new DriveTrain_DriveStraightForInches(.6, 40));
	        addSequential(new Intake_EjectForSeconds(1));
	        addParallel(new DriveTrain_DriveStraightForInches(-.6, 6));
	        addSequential(new Lift_MoveToPosition(Lift.Floor), 12);
	        addSequential(new DriveTrain_TurnToAngle(105));
	        addParallel(new Intake_GrabCubeForSeconds(4.5), 4.5);
    	    addSequential(new DriveTrain_DriveStraightForInches(.6, 53)); 
    	    addSequential(new Lift_MoveToPosition(Lift.Switch));
    	    addSequential(new DriveTrain_DriveStraightForInches(-.7, 6));
    	}
    	else
    	{
    		addParallel(new Lift_MoveToPosition(Lift.Switch), 4);
    		addSequential(new DriveTrain_DriveStraightForInches(.95, 242));
    		addSequential(new DriveTrain_TurnToAngle(-38));
    		addSequential(new Lift_MoveToPosition(Lift.HighScale), 12);
	        addSequential(new Intake_EjectForSeconds(1));
	        addParallel(new Lift_MoveToPosition(Lift.Floor), 12);
	        addSequential(new DriveTrain_TurnToAngle(-105));
	        addParallel(new Intake_GrabCubeForSeconds(4.5), 4.5);
    	    addSequential(new DriveTrain_DriveStraightForInches(.6, 53)); 
    	    addSequential(new Lift_MoveToPosition(Lift.Switch));
    	    addSequential(new DriveTrain_DriveStraightForInches(-.7, 6)); 	
    	}
    }
}