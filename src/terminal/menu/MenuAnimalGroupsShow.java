package terminal.menu;

import java.util.ArrayList;
import java.util.List;

import zooData.ZooPopulation;

public class MenuAnimalGroupsShow extends MenuAnimalGroups {

    protected String[] all = { "4", "All", ZooPopulation.ALL.getName() };

    @Override
    List<String[]> getMenu() {
        List<String[]> menu = new ArrayList<>();
        menu.addAll(super.getMenu());
        menu.add(all);
        return menu;
    }
}
