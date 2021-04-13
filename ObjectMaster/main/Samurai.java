package HumanType;
import Human.Human;

public class Samurai extends Human{

    private static int currNumber = 0;

    public Samurai(){

        this.health = 200;
        this.currNumber += 1;

    }

    public void deathBlow(Human otherHuman){


        otherHuman.health = 0;
        this.health = (this.health)/2;

    }

    public void mediate(){

        this.health = 200;
    }

    public int howMany(){

        return this.currNumber;

    }



}