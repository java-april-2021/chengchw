public class PythagoreanTest{

    public static void main(String[] args){

        int a = 4;
        int b = 3;

        Pythagorean Cal = new Pythagorean();
        double CalculateHypotenuse = Cal.calculateHypotenuse(a, b);
        
        System.out.println("The pythagorean is " + CalculateHypotenuse);


    }

}