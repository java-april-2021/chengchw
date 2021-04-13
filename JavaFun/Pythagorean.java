public class Pythagorean{

    public double calculateHypotenuse(int legA, int legB){

        double Hypotenuse;
        double APart = legA*legA;
        double BPart = legB*legB;
        Hypotenuse = Math.sqrt(APart + BPart);

        return Hypotenuse;

    }

}