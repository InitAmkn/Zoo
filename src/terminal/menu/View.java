package terminal.menu;

import java.util.ArrayList;

import enun.ZooCommand;
import enun.ZooPopulation;
import terminal.menu.create.MenuCreate;
import terminal.menu.create.MenuCreateLion;
import terminal.menu.create.MenuCreateSnake;
import terminal.menu.create.MenuCreateWolf;
import terminal.menu.delete.MenuDelete;
import terminal.menu.delete.MenuDeleteLion;
import terminal.menu.delete.MenuDeleteSnake;
import terminal.menu.delete.MenuDeleteWolf;

public class View {
    Menu action = new MenuActions();
    Menu animalGroups = new MenuAnimalGroups();
    Menu animalGroupsShow = new MenuAnimalGroupsShow();
    MenuCreate menuCreateLion = new MenuCreateLion();
    MenuCreate menuCreateWolf = new MenuCreateWolf();
    MenuCreate menuCreateSnake = new MenuCreateSnake();
    MenuDelete menuDeleteLion = new MenuDeleteLion();
    MenuDelete menuDeleteWolf = new MenuDeleteWolf();
    MenuDelete menuDeleteSnake = new MenuDeleteSnake();

    public String start() {
        ArrayList<String> result = new ArrayList<>();
        result.add(action.select());

        if (result.get(0).equals(ZooCommand.ADD.getName())) {
            result.add(animalGroups.select());

            if (result.get(1).equals(ZooPopulation.LION.getName())) {
                result.addAll(menuCreateLion.select());
            }
            if (result.get(1).equals(ZooPopulation.WOLF.getName())) {
                result.addAll(menuCreateWolf.select());
            }
            if (result.get(1).equals(ZooPopulation.SNAKE.getName())) {
                result.addAll(menuCreateSnake.select());
            }

        } else if (result.get(0).equals(ZooCommand.DELETE.getName())) {
            result.add(animalGroups.select());

            if (result.get(1).equals(ZooPopulation.LION.getName())) {
                result.addAll(menuDeleteLion.select());
            }
            if (result.get(1).equals(ZooPopulation.WOLF.getName())) {
                result.addAll(menuDeleteWolf.select());
            }
            if (result.get(1).equals(ZooPopulation.SNAKE.getName())) {
                result.addAll(menuDeleteSnake.select());
            }

        } else if (result.get(0).equals(ZooCommand.SHOW.getName())) {
            result.add(animalGroupsShow.select());
        }

        System.out.println(String.join("\s", result));
        return String.join("\s", result);

    }
}