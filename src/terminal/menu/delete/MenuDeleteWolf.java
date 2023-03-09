package terminal.menu.delete;

import java.util.ArrayList;

import zooData.ZooPopulation;

public class MenuDeleteWolf extends MenuDelete {

    protected String introductoryPhrase = String.format("Enter the data about the %s:", ZooPopulation.WOLF.getName());

    @Override
    public ArrayList<String> select() {
        System.out.println(introductoryPhrase);
        return super.select();
    }

}
