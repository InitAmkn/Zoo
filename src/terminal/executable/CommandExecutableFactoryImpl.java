package terminal.executable;

import terminal.command.Command;
import terminal.executable.operations.create.CreateLionExecutable;
import terminal.executable.operations.create.CreateSnakeExecutable;
import terminal.executable.operations.create.CreateWolfExecutable;
import terminal.executable.operations.delete.DeleteLionExecutable;
import terminal.executable.operations.delete.DeleteSnakeExecutable;
import terminal.executable.operations.delete.DeleteWolfExecutable;
import terminal.executable.operations.show.ShowAllExecutable;
import terminal.executable.operations.show.ShowLionExecutable;
import terminal.executable.operations.show.ShowSnakeExecutable;
import terminal.executable.operations.show.ShowWolfExecutable;
import zoo.Zoo;

public class CommandExecutableFactoryImpl implements CommandExecutableFactory {

    Zoo zoo;

    public CommandExecutableFactoryImpl(Zoo zoo) {
        this.zoo = zoo;
    }

    public CommandExecutable create(Command input) {

        if (input.isCreate()) {
            if (input.isLion()) {
                return new CreateLionExecutable(input.getParameters(), zoo);
            }
            if (input.isWolf()) {
                return new CreateWolfExecutable(input.getParameters(), zoo);
            }
            if (input.isSnakes()) {
                return new CreateSnakeExecutable(input.getParameters(), zoo);
            }
        }
        if (input.isDelete()) {
            if (input.isLion()) {
                return new DeleteLionExecutable(input.getParameters(), zoo);
            }
            if (input.isWolf()) {
                return new DeleteWolfExecutable(input.getParameters(), zoo);
            }
            if (input.isSnakes()) {
                return new DeleteSnakeExecutable(input.getParameters(), zoo);
            }
        }

        if (input.isShow()) {
            if (input.isLion()) {
                return new ShowLionExecutable(zoo);
            }
            if (input.isWolf()) {
                return new ShowWolfExecutable(zoo);
            }
            if (input.isSnakes()) {
                return new ShowSnakeExecutable(zoo);
            }
            if (input.isAll()) {
                return new ShowAllExecutable(zoo);
            }
        }
        return null;
    }

}
