package com.example.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;

import java.util.Date;

/**
 * 系统角色表
 *
 * @author zhangzijun0812@163.com 2023-02-03 10:00:10
 */
@ApiModel("系统角色表")
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@Table(name = "system_role")
public class SystemRole {

    public static final String FIELD_ROLE_ID = "roleId";
    public static final String FIELD_NAME = "name";
    public static final String FIELD_CODE = "code";
    public static final String FIELD_PID = "pid";
    public static final String FIELD_PID_TREE = "pidTree";
    public static final String FIELD_TYPE = "type";
    public static final String FIELD_ROLE_CLASSIFY = "roleClassify";
    public static final String FIELD_DESC = "desc";
    public static final String FIELD_SORTED = "sorted";
    public static final String FIELD_CREATED_BY = "createdBy";
    public static final String FIELD_CREATION_DATE = "creationDate";
    public static final String FIELD_LAST_UPDATED_BY = "lastUpdatedBy";
    public static final String FIELD_LAST_UPDATE_DATE = "lastUpdateDate";
    public static final String FIELD_LAST_UPDATE_LOGIN = "lastUpdateLogin";
    public static final String FIELD_REQUEST_ID = "requestId";
    public static final String FIELD_PROGRAM_ID = "programId";
    public static final String FIELD_OBJECT_VERSION_NUMBER = "objectVersionNumber";

//
// 业务方法(按public protected private顺序排列)
// ------------------------------------------------------------------------------

//
// 数据库字段
// ------------------------------------------------------------------------------


    @ApiModelProperty("主键ID")
    @Id
    @GeneratedValue
    private Long roleId;
    @ApiModelProperty(value = "角色名称", required = true)
    @NotBlank
    private String name;
    @ApiModelProperty(value = "角色编号", required = true)
    @NotBlank
    private String code;
    @ApiModelProperty(value = "父角色ID")
    private Long pid;
    @ApiModelProperty(value = "角色树", required = true)
    @NotBlank
    private String pidTree;
    @ApiModelProperty(value = "角色类型")
    private Long type;
    @ApiModelProperty(value = "角色分类")
    private String roleClassify;
    @ApiModelProperty(value = "角色描述")
    private String desc;
    @ApiModelProperty(value = "排序值")
    private Long sorted;
    @ApiModelProperty(value = "")
    private Long createdBy;
    @ApiModelProperty(value = "")
    private Date creationDate;
    @ApiModelProperty(value = "")
    private Long lastUpdatedBy;
    @ApiModelProperty(value = "")
    private Date lastUpdateDate;
    @ApiModelProperty(value = "")
    private Long lastUpdateLogin;
    @ApiModelProperty(value = "")
    private Long requestId;
    @ApiModelProperty(value = "")
    private Long programId;
    @ApiModelProperty(value = "")
    private Long objectVersionNumber;

//
// 非数据库字段
// ------------------------------------------------------------------------------

//
// getter/setter
// ------------------------------------------------------------------------------

    /**
     * @return 主键ID
     */
    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * @return 角色名称
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return 角色编号
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return 父角色ID
     */
    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    /**
     * @return 角色树
     */
    public String getPidTree() {
        return pidTree;
    }

    public void setPidTree(String pidTree) {
        this.pidTree = pidTree;
    }

    /**
     * @return 角色类型
     */
    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    /**
     * @return 角色分类
     */
    public String getRoleClassify() {
        return roleClassify;
    }

    public void setRoleClassify(String roleClassify) {
        this.roleClassify = roleClassify;
    }

    /**
     * @return 角色描述
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
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
     * @return
     */
    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * @return
     */
    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * @return
     */
    public Long getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(Long lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    /**
     * @return
     */
    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    /**
     * @return
     */
    public Long getLastUpdateLogin() {
        return lastUpdateLogin;
    }

    public void setLastUpdateLogin(Long lastUpdateLogin) {
        this.lastUpdateLogin = lastUpdateLogin;
    }

    /**
     * @return
     */
    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    /**
     * @return
     */
    public Long getProgramId() {
        return programId;
    }

    public void setProgramId(Long programId) {
        this.programId = programId;
    }

    /**
     * @return
     */
    public Long getObjectVersionNumber() {
        return objectVersionNumber;
    }

    public void setObjectVersionNumber(Long objectVersionNumber) {
        this.objectVersionNumber = objectVersionNumber;
    }

}
