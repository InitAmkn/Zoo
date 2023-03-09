package terminal.menu.delete;

import java.util.ArrayList;

import enun.ZooPopulation;

public class MenuDeleteSnake extends MenuDelete {

    protected String introductoryPhrase = String.format("Enter the data about the %s:", ZooPopulation.SNAKE.getName());

    @Override
    public ArrayList<String> select() {
        System.out.println(introductoryPhrase);
        return super.select();
    }
}
