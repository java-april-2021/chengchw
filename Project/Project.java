class Project{

    private String name;
    private String discription;
    private double initialCost;

    public Project(){}

    public Project(String InputName, String InputDiscription){

        this.name = InputName;
        this.discription = InputDiscription;
    }

    public Project(String InputName){

        this.name = InputName;

    }

    public String getName(){

        return this.name;
    } 

    public void getDicription(){

        System.out.println(this.discription);
        
    }

    public double getCost(){

        return this.initialCost;
    } 

    public void setName(String inputName){

        this.name = inputName;
    }

    public void setDiscription(String inputDiscription){

        this.discription = inputDiscription;
    }

    public void setCost(double inputCost){

        this.initialCost = inputCost;
    }

    public String elevationPitch(){

        String output = "Hi my name is " + this.name + "("+this.initialCost+"): " + this.discription;
        return output;
    }

    

}