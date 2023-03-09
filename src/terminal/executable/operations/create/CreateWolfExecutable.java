package terminal.executable.operations.create;

import java.util.List;

import animals.Wolf;
import zoo.Zoo;

public class CreateWolfExecutable extends CreateExecutable {

    public CreateWolfExecutable(List<String> input, Zoo zoo) {
        super(input, zoo);
    }

    @Override
    public void execute() {
        zoo.addWolf(new Wolf(
                this.name,
                this.yearBirth,
                this.countLimbs,
                this.weight));
        zoo.showAllWolf();
    }

}
