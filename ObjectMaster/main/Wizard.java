package HumanType;
import Human.Human;

public class Wizard extends Human{


    public Wizard(){

        this.health = 50;
        this.intelligence = 8;

    }

    public void heal(Human otherHuman){

        otherHuman.health += this.intelligence;

    }

    public void fireBall(Human otherHuman){

        otherHuman.health -= this.intelligence*3;
    }


}

