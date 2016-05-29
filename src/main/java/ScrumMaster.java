/**
 * Created by 985191 on 5/29/2016.
 */
public class ScrumMaster extends Employee {


    public void showResponsiblities() {

        Role role = new Role();
        role.setRoleName("ScrumMaster");
        roleList.add(role);
    }



    public void manageSprint(Sprint sprint)
    {
        System.out.println("sprint: "+sprint.toString()+"\n is managed by" +this.getEmpName());
        sprint.setMaster(this);

    }

    public Sprint createSprint()
    {
        System.out.println("Sprint: "+"\n is created by" +this.getEmpName());
        return new Sprint();
    }

    public void assignDevelopmentFeature(Feature feature, Developer developer)
    {
        developer.setFeature(feature);
    }

    public void assignTestingFeature(Feature feature, Tester tester)
    {
        tester.setFeature(feature);
    }
}
