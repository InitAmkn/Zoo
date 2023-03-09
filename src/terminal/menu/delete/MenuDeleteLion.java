package terminal.menu.delete;

import java.util.ArrayList;

import zooData.ZooPopulation;

public class MenuDeleteLion extends MenuDelete {

    protected String introductoryPhrase = String.format("Enter the data about the %s:", ZooPopulation.LION.getName());

    @Override
    public ArrayList<String> select() {
        System.out.println(introductoryPhrase);
        return super.select();
    }
}
