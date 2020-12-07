package com.bborzechowski.service;

import com.bborzechowski.Pawn;
import com.bborzechowski.SimulationRound;
import com.bborzechowski.command.Command;
import com.bborzechowski.command.CommandFactory;

public class SimulationService {

    public void start(SimulationRound simulationRound) {

        Pawn pawn = new Pawn();

        for (String commandString : simulationRound.getCommands()) {

            Command command = CommandFactory.getCommand(commandString);

            if (command != null) {

                command.execute(pawn);

            } else {

                System.err.println("Wrong command: " + commandString);
            }
        }
        System.out.println("Output: " + pawn.getCurrentStatus());

    }

}
