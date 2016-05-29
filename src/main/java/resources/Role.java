package resources;

/**
 * Created by 985191 on 5/29/2016.
 */
public class Role {

    private String roleName;
    private int roleId = 0;
    private RoleType roleType;

    /**
     * This shows role an Employee has
     */
    enum RoleType {
        PROJECT_MANAGER,
        SCRUM_MASTER,
        DEVELOPER,
        TERSTER,
    }



    public Role() {
    }

    public Role(String roleName, int roleId) {
        this.roleName = roleName;
        this.roleId = roleId;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
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
