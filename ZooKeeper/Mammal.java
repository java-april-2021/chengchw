public class Mammal{

    protected int energyLevel = 100;

    
    public int displayEnergy(){

        System.out.println("The energy of the animal is " + this.energyLevel);

        return this.energyLevel;

    }



}