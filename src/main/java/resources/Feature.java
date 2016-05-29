package resources;

import staff.Developer;
import staff.Tester;

/**
 * Created by 985191 on 5/29/2016.
 */
public class Feature {

    private String featureName;
    private Sprint sprint;
    private Developer developer;
    private Tester tester;
    private Project project;


    public Feature(String featureName) {
        this.featureName = featureName;
    }


    public Feature(String featureName, Sprint sprint, Developer developer, Tester tester, Project project) {
        this.featureName = featureName;
        this.sprint = sprint;
        this.developer = developer;
        this.tester = tester;
        this.project = project;
    }


    public String getFeatureName() {
        return featureName;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    public Sprint getSprint() {
        return sprint;
    }

    public void setSprint(Sprint sprint) {
        this.sprint = sprint;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }

    public Tester getTester() {
        return tester;
    }

    public void setTester(Tester tester) {
        this.tester = tester;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
