import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by 985191 on 5/29/2016.
 */
public class Project {

    private String projectName;
    private ProjectManager manager;
    private ArrayList<Sprint> sprintsList;
    private ArrayList<Feature> listfeaturs;

    public Project(){};

    public Project(String projectName) {
        this.projectName = projectName;
    }

    public Project(String projectName, ProjectManager manager, ArrayList<Sprint> sprintsList, ArrayList<Feature> listfeaturs) {
        this.projectName = projectName;
        this.manager = manager;
        this.sprintsList = sprintsList;
        this.listfeaturs = listfeaturs;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public ProjectManager getManager() {
        return manager;
    }

    public void setManager(ProjectManager manager) {
        this.manager = manager;
    }

    public ArrayList<Sprint> getSprintsList() {
        return sprintsList;
    }

    public void setSprintsList(ArrayList<Sprint> sprintsList) {
        this.sprintsList = sprintsList;
    }

    public ArrayList<Feature> getListfeaturs() {
        return listfeaturs;
    }

    public void setListfeaturs(ArrayList<Feature> listfeaturs) {
        this.listfeaturs = listfeaturs;
    }
}
