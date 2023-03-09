package terminal.executable.operations.delete;

import java.util.List;

import zoo.Zoo;

public class DeleteLionExecutable extends DeleteExecutable {

    public DeleteLionExecutable(List<String> input, Zoo zoo) {
        super(input, zoo);
    }

    @Override
    public void execute() {
        this.zoo.takeOfLion(this.name);
    }

}
