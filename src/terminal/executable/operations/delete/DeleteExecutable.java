package terminal.executable.operations.delete;

import java.util.List;

import terminal.executable.CommandExecutable;
import zoo.Zoo;

public abstract class DeleteExecutable implements CommandExecutable {

    protected Zoo zoo;
    protected String name;

    public DeleteExecutable(List<String> input, Zoo zoo) {
        this.name = input.get(0);
        this.zoo = zoo;
    }

}
