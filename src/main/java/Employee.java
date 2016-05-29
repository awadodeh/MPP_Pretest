import java.util.ArrayList;

/**
 * Created by 985191 on 5/29/2016.
 */
public abstract class Employee {

    protected String empName;
    protected String empSSN;
    protected String empEmailAddr;
    protected int empId;
    protected ArrayList<Role> roleList;




    public abstract void showResponsiblities();


    public ArrayList<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(ArrayList<Role> roleList) {
        this.roleList = roleList;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpSSN() {
        return empSSN;
    }

    public void setEmpSSN(String empSSN) {
        this.empSSN = empSSN;
    }

    public String getEmpEmailAddr() {
        return empEmailAddr;
    }

    public void setEmpEmailAddr(String empEmailAddr) {
        this.empEmailAddr = empEmailAddr;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
}
