package terminal.menu.create;

import java.util.ArrayList;
import java.util.List;

import zooData.ZooPopulation;

public class MenuCreateSnake extends MenuCreate {

    protected String introductoryPhrase = String.format("Enter the data about the %s:", ZooPopulation.SNAKE.getName());
    protected String bodyLength = "Body length:";

    @Override
    public List<String> getMenu() {
        List<String> menu = new ArrayList<>();
        menu.addAll(super.getMenu());
        menu.add(bodyLength);
        return menu;
    }

    @Override
    public ArrayList<String> select() {
        System.out.println(introductoryPhrase);
        return super.select();
    }
}
