package terminal.menu;

import java.util.ArrayList;
import java.util.List;

import zooData.ZooCommand;

public class MenuActions extends Menu {

    protected String[] introductoryPhrase = { "", "Select an action:" };
    protected String[] add = { "1", "Add an animal", ZooCommand.ADD.getName() };
    protected String[] delete = { "2", "Delete an animal", ZooCommand.DELETE.getName() };
    protected String[] show = { "3", "Show animals", ZooCommand.SHOW.getName() };

    @Override
    List<String[]> getMenu() {
        List<String[]> menu = new ArrayList<>();
        menu.add(introductoryPhrase);
        menu.add(add);
        menu.add(delete);
        menu.add(show);
        return menu;
    }
}
