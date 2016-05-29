package staff;

import resources.Feature;
import resources.Project;
import resources.Role;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

/**
 * Created by 985191 on 5/29/2016.
 */
public class Developer extends Employee{

    private ArrayList<Feature> features;
    private Date estimatedEffort;

    public Developer() {
        this.features =  new ArrayList<Feature>();
    }

    public void showResponsiblities() {

        System.out.println("Developer.showResponsiblities");

        System.out.println("Responsiblities = ");

        for(Feature s:features)
        {
            System.out.println(s.getFeatureName()+", ");
        }

    }




    public ArrayList<Feature>  getFeature() {
        return features;
    }

    public void setFeature(ArrayList<Feature> features) {
        this.features.addAll(features);
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
