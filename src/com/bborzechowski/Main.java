package com.bborzechowski;

import com.bborzechowski.service.SimulationService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        newSimulation();
    }

    public static void newSimulation(){
        SimulationService service = new SimulationService();
        SimulationRound simulationRound = new SimulationRound();
        simulationRound.addCommand("P 0,0,N");    //start point

        System.out.println("Enter the pawn moves (INPUT)");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();
        int inputLength = input.length();
        for (int i = 0; i <inputLength ; i++) {
            simulationRound.addCommand(input.substring(i,i+1));
        }
        service.start(simulationRound);
    }
}
