package terminal.menu;

import java.util.ArrayList;
import java.util.List;

import zooData.ZooPopulation;

public class MenuAnimalGroups extends Menu {

    protected String[] introductoryPhrase = { "", "Select an action:" };
    protected String[] lions = { "1", "Lions", ZooPopulation.LION.getName() };
    protected String[] wolfs = { "2", "Wolfs", ZooPopulation.WOLF.getName() };
    protected String[] snakes = { "3", "Snakes", ZooPopulation.SNAKE.getName() };

    @Override
    List<String[]> getMenu() {
        List<String[]> menu = new ArrayList<>();
        menu.add(introductoryPhrase);
        menu.add(lions);
        menu.add(wolfs);
        menu.add(snakes);
        return menu;
    }
}
