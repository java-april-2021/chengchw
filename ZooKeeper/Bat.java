public class Bat extends Mammal{

    public Bat(){

        this.energyLevel = 300;
    }

    public void fly(){

        this.energyLevel -= 50;
        
        System.out.println("Bat flies to the sky");
    }

    public void eatHumans(){

        this.energyLevel += 25;
        System.out.println("So Fly");
    }

    public void attackTown(){

        this.energyLevel -= 100;
        System.out.println("Attack the Town");

    }

}