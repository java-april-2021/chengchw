
package Animal;
import Mammal.*;

public class Gorilla extends Mammal{

    public void throwSomething(){

        this.energyLevel -= 5;

        System.out.println("Gorilla had thrown something");

    }

    public void eatBananas(){

        this.energyLevel += 10;
        System.out.println("Gorilla eats banana");
    }

    public void climb(){

        this.energyLevel -= 10;
        System.out.println("Gorilla climbs the tree");
    }



}