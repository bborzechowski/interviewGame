package com.bborzechowski.command;

public class CommandFactory {

   private static final String PLACE_COMMAND_REGEX = "^(P)\\s\\d+,\\d+,(N|W|E|S)$";

    public static Command getCommand(String commandString) {

        if (commandString.matches(PLACE_COMMAND_REGEX)) {
            return new PlaceCommand(commandString);

        } else if (commandString.equals(CommandType.L.name())) {
            return new LeftCommand();

        } else if (commandString.equals(CommandType.R.name())) {
            return new RightCommand();

        } else if (commandString.equals(CommandType.M.name())) {
            return new MoveCommand();

        }
        return null;
    }
}
