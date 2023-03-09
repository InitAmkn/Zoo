package terminal.executable.operations.show;

import zoo.Zoo;

public class ShowLionExecutable extends ShowAllExecutable {

    public ShowLionExecutable(Zoo zoo) {
        super(zoo);
    }

    @Override
    public void execute() {
        zoo.showAllLions();
    }

}
