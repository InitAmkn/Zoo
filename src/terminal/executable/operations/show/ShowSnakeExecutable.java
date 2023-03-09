package terminal.executable.operations.show;

import zoo.Zoo;

public class ShowSnakeExecutable extends ShowAllExecutable {

    public ShowSnakeExecutable(Zoo zoo) {
        super(zoo);
    }

    @Override
    public void execute() {
        zoo.showAllSnake();
    }

}
