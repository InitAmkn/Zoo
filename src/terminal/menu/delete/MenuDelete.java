package terminal.menu.delete;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class MenuDelete {

    protected String name = "Name:";

    List<String> getMenu() {
        List<String> menu = new ArrayList<>();
        menu.add(name);
        return menu;
    }

    Scanner iScanner = new Scanner(System.in);

    public ArrayList<String> select() {

        ArrayList<String> outString = new ArrayList<>();

        int i = 0;
        while (i < getMenu().size()) {
            System.out.print(getMenu().get(i));
            System.out.print(" ");
            String input = iScanner.nextLine();
            outString.add(input);
            i++;
        }
        return outString;
    }
}