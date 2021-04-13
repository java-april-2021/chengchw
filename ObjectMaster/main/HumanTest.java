import Human.Human;
import HumanType.Ninja;
import HumanType.Samurai;
import HumanType.Wizard;

public class HumanTest{

    public static void main(String[] args){

        Human HM1 = new Human();
        Human HM2 = new Human();
        Ninja NJ = new Ninja();
        Wizard WZ = new Wizard();
        Samurai SM = new Samurai();
        Samurai SM2 = new Samurai();
        Samurai SM3 = new Samurai();

        System.out.println("M1 has strength: " + HM1.strength+" stealth: " + HM1.stealth+ " health: " + HM1.health);
        HM2.attack(HM1);
        System.out.println("M2 has strength: " + HM2.strength+" stealth: " + HM2.stealth+ " health: " + HM2.health);
        System.out.println("M1 has strength: " + HM1.strength+" stealth: " + HM1.stealth+ " health: " + HM1.health);
        NJ.steal(HM1);
        System.out.println("NJ has strength: " + NJ.strength+" stealth: " + NJ.stealth+ " health: " + NJ.health);
        System.out.println("M1 has strength: " + HM1.strength+" stealth: " + HM1.stealth+ " health: " + HM1.health);
        WZ.heal(HM1);
        System.out.println("M1 has strength: " + HM1.strength+" stealth: " + HM1.stealth+ " health: " + HM1.health);
        WZ.fireBall(HM1);
        System.out.println("M1 has strength: " + HM1.strength+" stealth: " + HM1.stealth+ " health: " + HM1.health);
        SM2.deathBlow(HM1);
        System.out.println("M1 has strength: " + HM1.strength+" stealth: " + HM1.stealth+ " health: " + HM1.health);
        System.out.println("SM2 has strength: " + SM2.strength+" stealth: " + SM2.stealth+ " health: " + SM2.health);
        System.out.println("SM2 has number: " + SM2.howMany());
        SM2.mediate();
        System.out.println("SM2 has strength: " + SM2.strength+" stealth: " + SM2.stealth+ " health: " + SM2.health);

    }

}