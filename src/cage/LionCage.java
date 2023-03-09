package cage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

import animals.Lion;
import animals.Comparators.LionComparator;

public class LionCage implements AnimalCage<Lion> {

    private ArrayList<Lion> lionsInCage;
    private LocalDate dateFeed;

    public LionCage() {
        this.lionsInCage = new ArrayList<Lion>();
    }

    public LionCage(ArrayList<Lion> lions) {
        this.lionsInCage = lions;
    }

    @Override
    public void addAnimal(Lion animal) {
        if (animal instanceof Lion) {
            lionsInCage.add((Lion) animal);
        }
    }

    public ArrayList<Lion> getAll() {
        return lionsInCage;
    }

    @Override
    public LocalDate feed(double weightFoodKG) {
        double foodForOne = weightFoodKG / lionsInCage.size();
        for (Lion el : lionsInCage) {
            el.feed(foodForOne);
        }
        dateFeed = LocalDate.now();
        return dateFeed;
    }

    @Override
    public LocalDate checkDateTheLastFeeding() {
        return dateFeed;
    }

    @Override
    public String toString() {
        StringBuilder lions = new StringBuilder();
        for (Lion el : lionsInCage) {
            lions.append(el.toString());
            lions.append(" - За решеткой\n");
        }
        return lions.toString();
    }

    public void sortByManeVolume() {
        Collections.sort(lionsInCage, new LionComparator());
    }

    @Override
    public Lion releaseAnimalFromCage(String name) {

        if (lionsInCage.size() > 0) {
            for (Lion lion : lionsInCage) {
                if (lion.getName().equalsIgnoreCase(name)) {
                    Lion lionRemoved = lion;
                    lionsInCage.remove(lion);
                    return lionRemoved;
                }
            }

        }
        return null;
    }

}
