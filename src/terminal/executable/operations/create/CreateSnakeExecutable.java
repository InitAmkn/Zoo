package terminal.executable.operations.create;

import java.util.List;

import animals.Snake;
import zoo.Zoo;

public class CreateSnakeExecutable extends CreateExecutable {

    private int bodyLength;

    public CreateSnakeExecutable(List<String> input, Zoo zoo) {
        super(input, zoo);
        this.bodyLength = Integer.parseInt(input.get(4));

    }

    @Override
    public void execute() {
        zoo.addSnake(new Snake(
                this.name,
                this.yearBirth,
                this.countLimbs,
                this.weight,
                this.bodyLength));
        zoo.showAllSnake();
    }

}
