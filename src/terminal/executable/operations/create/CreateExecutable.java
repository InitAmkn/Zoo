package terminal.executable.operations.create;

import java.util.List;

import terminal.executable.CommandExecutable;
import zoo.Zoo;

public abstract class CreateExecutable implements CommandExecutable {

    protected String name;
    protected int yearBirth;
    protected int countLimbs;
    protected double weight;
    protected Zoo zoo;

    public CreateExecutable(List<String> input, Zoo zoo) {
        this.name = input.get(0);
        this.yearBirth = Integer.parseInt(input.get(1));
        this.countLimbs = Integer.parseInt(input.get(2));
        this.weight = Double.parseDouble(input.get(3));
        this.zoo = zoo;
    }

}
