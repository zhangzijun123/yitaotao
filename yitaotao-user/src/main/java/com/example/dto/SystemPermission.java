package com.example.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.validation.constraints.NotBlank;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 功能权限
 *
 * @author zhangzijun0812@163.com 2023-02-03 10:00:10
 */
@ApiModel("功能权限")
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@Table(name = "system_permission")
public class SystemPermission {

    public static final String FIELD_PERMISSION_ID = "permissionId";
    public static final String FIELD_NAME = "name";
    public static final String FIELD_PERMISSION = "permission";
    public static final String FIELD_PATH = "path";
    public static final String FIELD_URL = "url";
    public static final String FIELD_METHOD = "method";
    public static final String FIELD_PARENT_ID = "parentId";
    public static final String FIELD_ICON = "icon";
    public static final String FIELD_COMPONENT = "component";
    public static final String FIELD_SORTED = "sorted";
    public static final String FIELD_TYPE = "type";
    public static final String FIELD_CREATE_TIME = "createTime";
    public static final String FIELD_UPDATE_TIME = "updateTime";
    public static final String FIELD_LOGICAL_DELETED = "logicalDeleted";

//
// 业务方法(按public protected private顺序排列)
// ------------------------------------------------------------------------------

//
// 数据库字段
// ------------------------------------------------------------------------------


    @ApiModelProperty("菜单ID")
    @Id
    @GeneratedValue
    private Long permissionId;
    @ApiModelProperty(value = "菜单名称", required = true)
    @NotBlank
    private String name;
    @ApiModelProperty(value = "菜单权限标识")
    private String permission;
    @ApiModelProperty(value = "前端URL")
    private String path;
    @ApiModelProperty(value = "请求链接")
    private String url;
    @ApiModelProperty(value = "请求方法")
    private String method;
    @ApiModelProperty(value = "父菜单ID")
    private Long parentId;
    @ApiModelProperty(value = "图标")
    private String icon;
    @ApiModelProperty(value = "组件")
    private String component;
    @ApiModelProperty(value = "排序值")
    private Long sorted;
    @ApiModelProperty(value = "菜单类型 （0菜单 1按钮）")
    private Long type;
    @ApiModelProperty(value = "创建时间")
    private String createTime;
    @ApiModelProperty(value = "更新时间")
    private String updateTime;
    @ApiModelProperty(value = "逻辑删除：0--正常 1--删除")
    private Long logicalDeleted;

//
// 非数据库字段
// ------------------------------------------------------------------------------

//
// getter/setter
// ------------------------------------------------------------------------------

    /**
     * @return 菜单ID
     */
    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    /**
     * @return 菜单名称
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return 菜单权限标识
     */
    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    /**
     * @return 前端URL
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * @return 请求链接
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return 请求方法
     */
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * @return 父菜单ID
     */
    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * @return 图标
     */
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * @return 组件
     */
    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    /**
     * @return 排序值
     */
    public Long getSorted() {
        return sorted;
    }

    public void setSorted(Long sorted) {
        this.sorted = sorted;
    }

    /**
     * @return 菜单类型 （0菜单 1按钮）
     */
    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
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
     * @return 更新时间
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return 逻辑删除：0--正常 1--删除
     */
    public Long getLogicalDeleted() {
        return logicalDeleted;
    }

    public void setLogicalDeleted(Long logicalDeleted) {
        this.logicalDeleted = logicalDeleted;
    }

}
