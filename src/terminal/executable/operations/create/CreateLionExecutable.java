package terminal.executable.operations.create;

import java.util.List;

import animals.Lion;
import zoo.Zoo;

public class CreateLionExecutable extends CreateExecutable {

    private int maneVolume;

    public CreateLionExecutable(List<String> input, Zoo zoo) {
        super(input, zoo);
        this.maneVolume = Integer.parseInt(input.get(4));
    }

    @Override
    public void execute() {
        zoo.addLion(new Lion(
                this.name,
                this.yearBirth,
                this.countLimbs,
                this.weight,
                this.maneVolume));
        zoo.showAllLions();
    }

}
