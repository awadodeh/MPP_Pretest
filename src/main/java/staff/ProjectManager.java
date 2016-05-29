package staff;

import resources.Project;
import resources.Role;
import resources.Sprint;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by 985191 on 5/29/2016.
 */
public class ProjectManager extends Employee{

    private ArrayList<Project> projects;

    public ProjectManager(String name) {
        empName=name;
        projects=new ArrayList<Project>();
    }

    public void showResponsiblities() {

        System.out.println("ProjectManager.showResponsiblities");
        System.out.println("Responsiblities = ");

        for(Project s:projects)
        {
            System.out.println(s.getProjectName()+", ");
        }

    }


    public void manageProject(Project project)
    {
        System.out.println("project: "+project.toString()+"\n is managed by" +this.getEmpName());
        project.setManager(this);

    }

    public Project createProject()
    {
        System.out.println("project: "+"\n is created by" +this.getEmpName());
        return new Project();
    }

    public ArrayList<Project> getProjects() {
        return projects;
    }

    public void setProjects(ArrayList<Project> projects) {
        this.projects.addAll(projects);
    }

    public void setProjects(Project projects) {
        this.projects.add(projects);
    }
}
