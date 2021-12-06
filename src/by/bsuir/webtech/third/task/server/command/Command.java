package by.bsuir.webtech.third.task.server.command;

import by.bsuir.webtech.third.task.server.command.exception.CommandException;

public interface Command {
    String execute(Object caller, String request) throws CommandException;
}
