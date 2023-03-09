package zoo;

import animals.Lion;
import animals.Snake;
import animals.Wolf;
import cage.AnimalCage;
import cage.LionCage;
import cage.SnakeCage;
import cage.WolfCage;

public class Zoo {

    public AnimalCage<Wolf> wolfs = new WolfCage();
    public AnimalCage<Lion> lions = new LionCage();
    public AnimalCage<Snake> snakes = new SnakeCage();

    public Zoo() {
    };

    public Zoo(AnimalCage<Wolf> wolfs,
            AnimalCage<Lion> lions,
            AnimalCage<Snake> snakes) {
        this.wolfs = wolfs;
        this.lions = lions;
        this.snakes = snakes;

    }

    public void showAllAnimals() {
        showAllLions();
        showAllWolf();
        showAllSnake();
    }

    public void showAllLions() {
        System.out.println();
        System.out.println("All the lions in the zoo: ");
        System.out.println(lions);
    }

    public void showAllWolf() {
        System.out.println();
        System.out.println("All the wolfs in the zoo: ");
        System.out.println(wolfs);
    }

    public void showAllSnake() {
        System.out.println();
        System.out.println("All the snake in the zoo: ");
        System.out.println(snakes);
    }

    public Lion takeOfLion(String name) {
        return lions.releaseAnimalFromCage(name);
    }

    public Wolf takeOfWolf(String name) {
        return wolfs.releaseAnimalFromCage(name);
    }

    public Snake takeOfSnake(String name) {
        return snakes.releaseAnimalFromCage(name);
    }

    public void addLion(Lion lion) {
        lions.addAnimal(lion);
    }

    public void addWolf(Wolf wolf) {
        wolfs.addAnimal(wolf);
    }

    public void addSnake(Snake snake) {
        snakes.addAnimal(snake);
    }
}
