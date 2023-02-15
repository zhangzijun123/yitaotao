package com.example.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.NotBlank;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 系统角色权限关联表
 *
 * @author zhangzijun0812@163.com 2023-02-03 10:00:10
 */
@ApiModel("系统角色权限关联表")
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@Table(name = "system_role_permission")
public class SystemRolePermission  {

    public static final String FIELD_ID = "id";
    public static final String FIELD_ROLE_ID = "roleId";
    public static final String FIELD_PERMISSION_ID = "permissionId";
    public static final String FIELD_CREATE_TIME = "createTime";
    public static final String FIELD_CREATE_USER = "createUser";

//
// 业务方法(按public protected private顺序排列)
// ------------------------------------------------------------------------------

//
// 数据库字段
// ------------------------------------------------------------------------------


    @ApiModelProperty("主键ID")
    @Id
    @GeneratedValue
    private Long id;
    @ApiModelProperty(value = "角色id")
    private Long roleId;
    @ApiModelProperty(value = "权限id")
    private Long permissionId;
    @ApiModelProperty(value = "创建时间", required = true)
    @NotBlank
    private String createTime;
    @ApiModelProperty(value = "创建人")
    private String createUser;

//
// 非数据库字段
// ------------------------------------------------------------------------------

//
// getter/setter
// ------------------------------------------------------------------------------

    /**
     * @return 主键ID
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return 角色id
     */
    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * @return 权限id
     */
    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    /**
     * @return 创建时间
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * @return 创建人
     */
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

}
