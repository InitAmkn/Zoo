package terminal.executable.operations.show;

import terminal.executable.CommandExecutable;
import zoo.Zoo;

public class ShowAllExecutable implements CommandExecutable {

    protected Zoo zoo;

    public ShowAllExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        zoo.showAllAnimals();
    }

}
