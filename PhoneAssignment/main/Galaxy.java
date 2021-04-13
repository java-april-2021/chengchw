package PhoneBrand;
import PhoneAbstract.Phone;
import PhoneInterphase.Ringable;

public class Galaxy extends Phone implements Ringable{

    public Galaxy (String VM, int BP, String Car, String RT){

        super(VM, BP, Car, RT);

    }

    @Override
    public String ring(){

        return this.getRT();
    }

    @Override
    public String unlock(){

        return "Unlock your Galaxy by finger printing";
    }

    @Override
    public void displayInfo(){

        System.out.println(String.format("Your version is %s Battery Percentage is %s on carrier %s ", this.getVN(), this.getBP(), this.getCA()));

    }




}