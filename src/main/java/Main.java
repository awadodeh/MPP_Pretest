import resources.Feature;
import resources.Project;
import resources.Sprint;
import staff.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by 985191 on 5/29/2016.
 */
public class Main {

    ArrayList<Employee> employees=new ArrayList<Employee>();

    public static void main(String[] args)
    {
        ProjectManager projectManager=new ProjectManager("Awad");

        Project project1 = new Project("Project#1");

//      Project project1= projectManager.createProject();
        projectManager.setProjects(project1);


        ScrumMaster scrumMaster=new ScrumMaster("Dewei");
        ScrumMaster scrumMaster2=new ScrumMaster("Ahmad");

//        scrumMaster.createSprint();

        ArrayList<Sprint> sprints=new ArrayList<Sprint>();

        Sprint sprint1=new Sprint("Sprint#1");
        sprint1.setMaster(scrumMaster);
        Sprint sprint2=new Sprint("Sprint#2");
        sprint1.setMaster(scrumMaster2);

        sprints.add(sprint1);
        sprints.add(sprint2);

        scrumMaster.setSprints(sprint1);
        scrumMaster.setSprints(sprint2);

        project1.setSprintsList(sprints);

        //We Create Features Now!!!
        ArrayList<Feature> features=new ArrayList<Feature>();
        Feature feature1=new Feature("Feature#1");
        Feature feature2=new Feature("Feature#2");



        Developer developer=new Developer();
        developer.setEmpName("Developer1");
        developer.setFeature(feature1);

        Tester tester1=new Tester("Tester1");
        tester1.setFeature(feature2);


        ArrayList<Employee> employees=new ArrayList<Employee>();
        employees.add(projectManager);
        employees.add(scrumMaster);
        employees.add(scrumMaster2);
        employees.add(developer);
        employees.add(tester1);


        showResponsibilities(employees);

    }


    public static void showResponsibilities(ArrayList<Employee> employees)
    {
        System.out.println("Main.showResponsibilities");
        for(Employee em:employees)
        {

            em.showResponsiblities();
        }
    }

}
