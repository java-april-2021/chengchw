package PhoneBrand;
import PhoneAbstract.Phone;
import PhoneInterphase.Ringable;

public class IPhone extends Phone implements Ringable{

    public IPhone (String VM, int BP, String Car, String RT){

        super(VM, BP, Car, RT);

    }

    @Override
    public String ring(){

        return this.getRT();
    }

    @Override
    public String unlock(){

        return "Unlock your Iphone by facial";
    }

    @Override
    public void displayInfo(){

        System.out.println(String.format("Your version is %s Battery Percentage is %s on carrier %s ", this.getVN(), this.getBP(), this.getCA()));

    }




}