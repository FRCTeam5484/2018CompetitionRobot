package org.usfirst.frc.team5484.robot.commands;

import org.usfirst.frc.team5484.robot.Robot;
import org.usfirst.frc.team5484.robot.subsystems.Lift;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Autonomous_ScaleSwitch_Right extends CommandGroup {

    public Autonomous_ScaleSwitch_Right() {
    	if(Robot.FieldSetup.charAt(1) == 'L')
    	{
    		addParallel(new Lift_MoveToPosition(Lift.Switch),12);
    		addSequential(new DriveTrain_DriveStraightForInches(.9, 225));
    		addSequential(new DriveTrain_TurnToAngle(-87));
    		addSequential(new DriveTrain_DriveStraightForInches(.85, 184));
    		addSequential(new DriveTrain_TurnToAngle(90));    	
	        addSequential(new Lift_MoveToPosition(Lift.MidScale),12);
	        addSequential(new DriveTrain_DriveStraightForInches(.75, 40));
	        addSequential(new Intake_EjectForSeconds(1));
	        addParallel(new DriveTrain_DriveStraightForInches(-.6, 6));
	        addSequential(new Lift_MoveToPosition(Lift.Floor), 12);
	        addSequential(new DriveTrain_TurnToAngle(105));
	        addParallel(new Intake_GrabCubeForSeconds(4.5), 4.5);
    	    addSequential(new DriveTrain_DriveStraightForInches(.75, 53)); 
    	    addSequential(new Lift_MoveToPosition(Lift.Switch));
    	    if(Robot.FieldSetup.charAt(0) == 'L')
    	    {
	    	    addSequential(new DriveTrain_DriveStraightForInches(.9, 5));
	    	    addSequential(new Intake_EjectForSeconds(1));
	    	    addSequential(new DriveTrain_DriveStraightForInches(-.7, 6));
	    	    addParallel(new Lift_MoveToPosition(Lift.Floor), 12);
    	    }
    	    else
    	    {
    	    	addSequential(new DriveTrain_DriveStraightForInches(-.9, 6));
    	    	addSequential(new DriveTrain_TurnToAngle(45));
    	    	addSequential(new DriveTrain_DriveStraightForInches(.9, 180));
    	    	addSequential(new Lift_MoveToPosition(Lift.Switch));
    	    }
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
    	    if(Robot.FieldSetup.charAt(0) == 'R')
    	    {
	    	    addSequential(new DriveTrain_DriveStraightForInches(.9, 5));
	    	    addSequential(new Intake_EjectForSeconds(1));
	    	    addSequential(new DriveTrain_DriveStraightForInches(-.7, 6));
	    	    addParallel(new Lift_MoveToPosition(Lift.Floor), 12);
    	    }
    	    else
    	    {
    	    	addSequential(new DriveTrain_DriveStraightForInches(-.7, 6));
    	    	addSequential(new DriveTrain_TurnToAngle(45));
    	    	addSequential(new DriveTrain_DriveStraightForInches(.9, 180));
    	    	addSequential(new Lift_MoveToPosition(Lift.Switch));
    	    }
    	}
    }
}