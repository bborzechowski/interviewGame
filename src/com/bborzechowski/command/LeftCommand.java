package com.bborzechowski.command;

import com.bborzechowski.Direction;
import com.bborzechowski.Pawn;

public class LeftCommand extends Command {

    public void execute(Pawn pawn) {

            switch (pawn.getDirection()) {
                case N:
                    pawn.setDirection(Direction.W);
                    break;
                case S:
                    pawn.setDirection(Direction.E);
                    break;
                case E:
                    pawn.setDirection(Direction.N);
                    break;
                case W:
                    pawn.setDirection(Direction.S);
                    break;
            }
        System.out.println("The pawn is rotating 90 degree to " + pawn.getDirection());
        }

    }

