package terminal.executable.operations.show;

import zoo.Zoo;

public class ShowWolfExecutable extends ShowAllExecutable {

    public ShowWolfExecutable(Zoo zoo) {
        super(zoo);
    }

    @Override
    public void execute() {
        zoo.showAllWolf();
    }

}
