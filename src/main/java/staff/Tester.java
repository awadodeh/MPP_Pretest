package staff;

import resources.Feature;
import resources.Role;
import resources.Sprint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by 985191 on 5/29/2016.
 */
public class Tester extends Employee {

    private ArrayList<Feature> features;
    private Date estimatedEffort;

    public Tester(String name) {
        setEmpName(name);
        features=new ArrayList<Feature>();
    }

    public void showResponsiblities() {

        System.out.println("Tester.showResponsiblities");
        System.out.println("features = ");
        for(Feature s:features)
        {
            System.out.println(s.getFeatureName()+", ");
        }
    }


    public ArrayList<Feature> getFeature() {
        return features;
    }

    public void setFeature(ArrayList<Feature> features) {
        this.features = features;
    }

    public void setFeature(Feature feature) {
        this.features.add(feature);
    }

    public Date getEstimatedEffort() {
        return estimatedEffort;
    }

    public void setEstimatedEffort(Date estimatedEffort) {
        this.estimatedEffort = estimatedEffort;
    }
}
