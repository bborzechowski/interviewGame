package com.bborzechowski.command;

import com.bborzechowski.Pawn;

public class MoveCommand extends Command {

    @Override
    public void execute(Pawn pawn) {

            switch (pawn.getDirection()) {
                case N:
                    if (pawn.getyPosition() < Pawn.MAX_POSITION) {
                        pawn.increaseYPosition();
                        System.out.println("The pawn is moving");

                    } else {
                        System.out.println("Move command ignored");
                    }
                    break;

                case S:
                    if (pawn.getyPosition() > Pawn.MIN_POSITION) {
                        pawn.decreaseYPosition();
                        System.out.println("The pawn is moving");
                    } else {
                        System.out.println("Move command ignored");
                    }
                    break;

                case E:
                    if (pawn.getxPosition() < Pawn.MAX_POSITION) {
                        pawn.increaseXPosition();
                        System.out.println("The pawn is moving");
                    } else {
                        System.out.println("Move command ignored");
                    }
                    break;

                case W:
                    if (pawn.getxPosition() > Pawn.MIN_POSITION) {
                        pawn.decreaseXPosition();
                        System.out.println("The pawn is moving");
                    } else {
                        System.out.println("Move command ignored");
                    }
                    break;
            }

        }
    }

