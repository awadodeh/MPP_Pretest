import java.util.Date;

/**
 * Created by 985191 on 5/29/2016.
 */
public class Tester extends Employee {

    private Feature feature;
    private Date estimatedEffort;

    public void showResponsiblities() {

        Role role= new Role();
        role.setRoleName("tester");
        roleList.add(role);
    }


    public Feature getFeature() {
        return feature;
    }

    public void setFeature(Feature feature) {
        this.feature = feature;
    }

    public Date getEstimatedEffort() {
        return estimatedEffort;
    }

    public void setEstimatedEffort(Date estimatedEffort) {
        this.estimatedEffort = estimatedEffort;
    }
}
