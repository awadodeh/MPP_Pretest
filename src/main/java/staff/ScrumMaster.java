package staff;

import resources.Feature;
import resources.Role;
import resources.Sprint;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by 985191 on 5/29/2016.
 */
public class ScrumMaster extends Employee {

    private ArrayList<Sprint> sprints;


    public ScrumMaster(String name) {
        setEmpName(name);
        sprints=new ArrayList<Sprint>();
    }

    public void showResponsiblities() {

        System.out.println("ScrumMaster.showResponsiblities");
        System.out.println("Responsiblities = ");

        for(Sprint s:sprints)
        {
            System.out.println(s.getSprintName()+", ");
        }
    }



    public void manageSprint(Sprint sprint)
    {
        System.out.println("sprint: "+sprint.toString()+"\n is managed by" +this.getEmpName());
        sprint.setMaster(this);

    }

    public Sprint createSprint()
    {
        System.out.println("resources.Sprint: "+"\n is created by" +this.getEmpName());
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


    public ArrayList<Sprint> getSprints() {
        return sprints;
    }

    public void setSprints(ArrayList<Sprint> sprints) {
        this.sprints.addAll(sprints);
    }


    public void setSprints(Sprint sprints) {
        this.sprints.add(sprints);
    }
}
