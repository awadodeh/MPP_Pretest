import java.util.ArrayList;
import java.util.Date;

/**
 * Created by 985191 on 5/29/2016.
 */
public class Sprint {

    private String sprintName;
    private ScrumMaster master;
    private Project project;
    private ArrayList<Feature> featurelist;
    private Date dueDate;

    public Sprint() {

    }

    public Sprint(String sprintName) {
        this.sprintName = sprintName;
    }

    public Sprint(String sprintName, ScrumMaster master, Project project, ArrayList<Feature> featurelist) {
        this.sprintName = sprintName;
        this.master = master;
        this.project = project;
        this.featurelist = featurelist;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getSprintName() {
        return sprintName;
    }

    public void setSprintName(String sprintName) {
        this.sprintName = sprintName;
    }

    public ScrumMaster getMaster() {
        return master;
    }

    public void setMaster(ScrumMaster master) {
        this.master = master;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public ArrayList<Feature> getFeaturelist() {
        return featurelist;
    }

    public void setFeaturelist(ArrayList<Feature> featurelist) {
        this.featurelist = featurelist;
    }
}
