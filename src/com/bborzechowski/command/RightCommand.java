package com.bborzechowski.command;


import com.bborzechowski.Direction;
import com.bborzechowski.Pawn;

public class RightCommand extends Command {


    @Override
    public void execute(Pawn pawn) {

            switch (pawn.getDirection()) {
                case N:
                    pawn.setDirection(Direction.E);
                    break;
                case S:
                    pawn.setDirection(Direction.W);
                    break;
                case E:
                    pawn.setDirection(Direction.S);
                    break;
                case W:
                    pawn.setDirection(Direction.N);
                    break;
            }
            System.out.println("The pawn is rotating 90 degree to " + pawn.getDirection());

        }
    }

