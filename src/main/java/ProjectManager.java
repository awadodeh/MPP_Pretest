/**
 * Created by 985191 on 5/29/2016.
 */
public class ProjectManager extends Employee{


    public void showResponsiblities() {

        Role role= new Role();
        role.setRoleName("PorjectManager");
        roleList.add(role);
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
}
