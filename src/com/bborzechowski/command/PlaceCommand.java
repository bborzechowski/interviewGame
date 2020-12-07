package com.bborzechowski.command;


import com.bborzechowski.Direction;
import com.bborzechowski.Pawn;

public class PlaceCommand extends Command {

    private String commandString;

    PlaceCommand(String commandString) {
        this.commandString = commandString;
    }

    @Override
    public void execute(Pawn pawn) {
        String placementArgs = substringAfter(commandString, CommandType.P.name());
        String[] args = placementArgs.split( ",");

        Integer initialX = Integer.parseInt(args[0].trim());
        Integer initialY = Integer.parseInt(args[1].trim());

        if (initialX <= Pawn.MAX_POSITION && initialX >= Pawn.MIN_POSITION
                && initialY <= Pawn.MAX_POSITION && initialY >= Pawn.MIN_POSITION) {
            pawn.setxPosition(initialX);
            pawn.setyPosition(initialY);
            pawn.setDirection(Direction.valueOf(args[2].trim()));
        } else {
            System.out.println("Place command ignored");
        }
    }
    public static String substringAfter(String str, String separator) {
        if (isEmpty(str)) {
            return str;
        } else if (separator == null) {
            return "";
        } else {
            int pos = str.indexOf(separator);
            return pos == -1 ? "" : str.substring(pos + separator.length());
        }
    }
    public static boolean isEmpty(CharSequence cs) {
        return cs == null || cs.length() == 0;
    }
}
