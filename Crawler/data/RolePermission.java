2
https://raw.githubusercontent.com/MandalasWang/rbac_shiro/master/src/main/java/ink/boyuan/rbac_shiro/domain/RolePermission.java
package ink.boyuan.rbac_shiro.domain;

/**
 * @author 有缘
 */
public class RolePermission {

  private Integer id;
  private Integer roleId;
  private Integer permissionId;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public Integer getRoleId() {
    return roleId;
  }

  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
  }


  public Integer getPermissionId() {
    return permissionId;
  }

  public void setPermissionId(Integer permissionId) {
    this.permissionId = permissionId;
  }

}