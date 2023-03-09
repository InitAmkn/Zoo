package terminal.executable.operations.delete;

import java.util.List;

import zoo.Zoo;

public class DeleteSnakeExecutable extends DeleteExecutable {

    public DeleteSnakeExecutable(List<String> input, Zoo zoo) {
        super(input, zoo);
    }

    @Override
    public void execute() {
        this.zoo.takeOfSnake(this.name);
    }

}
