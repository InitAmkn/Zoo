package terminal.parser;

import terminal.command.Command;

public interface CommandParser {
    Command parseCommand(String input);
    // \\s+ регулярные выражения

}
