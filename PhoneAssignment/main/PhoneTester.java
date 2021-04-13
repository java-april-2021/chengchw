import PhoneBrand.IPhone;
import PhoneBrand.Galaxy;

class PhoneTester{

    public static void main(String[]args){


        IPhone Apple1 = new IPhone("7",100,"Version","I am Apple Ring");

        System.out.println(Apple1.ring());
        System.out.println(Apple1.unlock());
        Apple1.displayInfo();
        System.out.println(Apple1.getBP());

        Galaxy Galaxy1 = new Galaxy("8",100,"Version","I am Galaxy Ring");

        System.out.println(Galaxy1.ring());
        System.out.println(Galaxy1.unlock());
        Galaxy1.displayInfo();
        System.out.println(Galaxy1.getBP());


    }
}