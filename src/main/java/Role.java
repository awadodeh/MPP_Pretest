/**
 * Created by 985191 on 5/29/2016.
 */
public class Role {

    private String roleName;
    private int roleId = 0;


    public Role() {
    }

    public Role(String roleName, int roleId) {
        this.roleName = roleName;
        this.roleId = roleId;
    }


    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
        roleId++;
    }

    public int getRoleId() {
        return roleId;
    }
}
