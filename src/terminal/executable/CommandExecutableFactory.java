package terminal.executable;

import terminal.command.Command;

public interface CommandExecutableFactory {
    public CommandExecutable create(Command command);
}
