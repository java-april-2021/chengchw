import java.util.*;

class Portfolio{

    private ArrayList<Project> projects;

    public Portfolio(){}

    public Portfolio(ArrayList<Project> InputProjects){

        this.projects = InputProjects;
    }

    public  ArrayList<String> getProjects(){

        ArrayList<String> ProjectsName = new ArrayList<String>();
        for(int i = 0 ; i < this.projects.size();i++){

            ProjectsName.add(projects.get(i).getName());

        }

        return ProjectsName;

    }

    public  void setProjects(ArrayList<Project> InputProjects){

        this.projects = InputProjects;      
        
    }
    
        
    
    
    public double getPortfolioCost(){

        double sum = 0;
        for(int i = 0; i < this.projects.size(); i++){
            sum += projects.get(i).getCost();
        }
        return sum;
    }

    public void showPortfolio(){

        double sum = 0;
        for(int i = 0; i < this.projects.size(); i++){
            System.out.println(this.projects.get(i).elevationPitch());
            sum += projects.get(i).getCost();

        }

        System.out.println("Total cost will be : " + sum);


    }





}