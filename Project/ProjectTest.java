import java.util.*;

public class ProjectTest{

    public static void main(String[] args){

        Project PJ1 = new Project();
        Project PJ2 = new Project("Picka");
        Project PJ3 = new Project("Picka Cow", "MoMoMo");

        PJ1.setName("Bird");
        PJ1.setDiscription("BiBiBi");
        PJ1.setCost(12.5);
        System.out.println(PJ1.getName());
        PJ1.getDicription();
        
        System.out.println(PJ1.elevationPitch());
        System.out.println("PJ1 Finished");

        
        System.out.println(PJ2.getName());
        PJ2.setDiscription("pikapika");
        PJ2.getDicription();
        PJ2.setCost(17.5);
        System.out.println(PJ2.elevationPitch());
        System.out.println("PJ2 Finished");

        
        System.out.println(PJ3.getName());
        PJ3.getDicription();
        PJ3.setCost(10.6);
        System.out.println(PJ3.elevationPitch());
        System.out.println("PJ3 Finished");


        ArrayList<Project> ProArr = new ArrayList<Project>();
        ProArr.add(PJ1);
        ProArr.add(PJ2);
        ProArr.add(PJ3);
        Portfolio PF = new Portfolio(ProArr);

        System.out.println(PF.getPortfolioCost());

        PF.showPortfolio();

        System.out.println(PF.getProjects());








    }


}