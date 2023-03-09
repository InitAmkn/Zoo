package terminal.menu.create;

import java.util.ArrayList;

import enun.ZooPopulation;

public class MenuCreateWolf extends MenuCreate {

    protected String introductoryPhrase = String.format("Enter the data about the %s:", ZooPopulation.WOLF.getName());

    @Override
    public ArrayList<String> select() {
        System.out.println(introductoryPhrase);
        return super.select();
    }

}
