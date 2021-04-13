
package PhoneAbstract;

public abstract class Phone{

    private String versionNumber;
    private int batteryPercentage;
   
    private String carrier;
    private String ringTone;

    public Phone(String VN, int BP, String Car, String RT){


        this.versionNumber = VN;
        this.batteryPercentage = BP;
        this.carrier = Car;
        this.ringTone = RT;

    }

    public abstract void displayInfo();

    public String getVN(){

        return this.versionNumber;
    }
    public String getCA(){

        return this.carrier;
    }

    public String getRT(){

        return this.ringTone;
    }

    public int getBP(){

        return this.batteryPercentage;
    }

}