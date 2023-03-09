package terminal.executable.operations.delete;

import java.util.List;

import zoo.Zoo;

public class DeleteWolfExecutable extends DeleteExecutable {

    public DeleteWolfExecutable(List<String> input, Zoo zoo) {
        super(input, zoo);
    }

    @Override
    public void execute() {
        this.zoo.takeOfWolf(this.name);
    }

}
