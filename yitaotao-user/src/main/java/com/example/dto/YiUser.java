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
 * 用户表
 *
 * @author zhangzijun0812@163.com 2023-02-03 10:00:10
 */
@ApiModel("用户表")
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@Table(name = "yi_user")
public class YiUser {

    public static final String FIELD_YU_ID = "yuId";
    public static final String FIELD_LOGIN_NAME = "loginName";
    public static final String FIELD_PASSWORD = "password";
    public static final String FIELD_USER_NAME = "userName";
    public static final String FIELD_NICK_NAME = "nickName";
    public static final String FIELD_TYPE = "type";
    public static final String FIELD_SEX = "sex";
    public static final String FIELD_PHONE = "phone";
    public static final String FIELD_MOBILE = "mobile";
    public static final String FIELD_EMAIL = "email";
    public static final String FIELD_ID_NUMBER = "idNumber";
    public static final String FIELD_USER_POST = "userPost";
    public static final String FIELD_WORK_TITLE = "workTitle";
    public static final String FIELD_WORK_POST = "workPost";
    public static final String FIELD_USER_DESC = "userDesc";
    public static final String FIELD_WORK_ROLE = "workRole";
    public static final String FIELD_LOGIN_TIME = "loginTime";
    public static final String FIELD_LAST_LOGIN_TIME = "lastLoginTime";
    public static final String FIELD_LOGIN_COUNT = "loginCount";
    public static final String FIELD_STATUS = "status";
    public static final String FIELD_USER_EXPIRE_TIME = "userExpireTime";
    public static final String FIELD_PASSWORD_EXPIRE_TIME = "passwordExpireTime";
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


    @ApiModelProperty("记录标识")
    @Id
    private Long yuId;
    @ApiModelProperty(value = "登录账号", required = true)
    @NotBlank
    private String loginName;
    @ApiModelProperty(value = "用户密码", required = true)
    @NotBlank
    private String password;
    @ApiModelProperty(value = "用户姓名", required = true)
    @NotBlank
    private String userName;
    @ApiModelProperty(value = "用户昵称")
    private String nickName;
    @ApiModelProperty(value = "用户类型")
    private Long type;
    @ApiModelProperty(value = "用户性别，0:未知，1 男 2 女")
    private Long sex;
    @ApiModelProperty(value = "用户电话")
    private String phone;
    @ApiModelProperty(value = "手机号")
    private String mobile;
    @ApiModelProperty(value = "电子邮箱")
    private String email;
    @ApiModelProperty(value = "用户身份证号码")
    private String idNumber;
    @ApiModelProperty(value = "用户职位")
    private String userPost;
    @ApiModelProperty(value = "工作职称")
    private String workTitle;
    @ApiModelProperty(value = "工作职位")
    private String workPost;
    @ApiModelProperty(value = "用户描述")
    private String userDesc;
    @ApiModelProperty(value = "工作角色")
    private String workRole;
    @ApiModelProperty(value = "登录时间")
    private Date loginTime;
    @ApiModelProperty(value = "上次登录时间")
    private Date lastLoginTime;
    @ApiModelProperty(value = "登录次数")
    private Long loginCount;
    @ApiModelProperty(value = "账号状态(0:正常，1:禁用)")
    private Long status;
    @ApiModelProperty(value = "用户过期时间", required = true)
    @NotBlank
    private String userExpireTime;
    @ApiModelProperty(value = "密码过期时间", required = true)
    @NotBlank
    private String passwordExpireTime;
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
     * @return 记录标识
     */
    public Long getYuId() {
        return yuId;
    }

    public void setYuId(Long yuId) {
        this.yuId = yuId;
    }

    /**
     * @return 登录账号
     */
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * @return 用户密码
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return 用户姓名
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return 用户昵称
     */
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * @return 用户类型
     */
    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    /**
     * @return 用户性别，0:未知，1 男 2 女
     */
    public Long getSex() {
        return sex;
    }

    public void setSex(Long sex) {
        this.sex = sex;
    }

    /**
     * @return 用户电话
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return 手机号
     */
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return 电子邮箱
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return 用户身份证号码
     */
    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * @return 用户职位
     */
    public String getUserPost() {
        return userPost;
    }

    public void setUserPost(String userPost) {
        this.userPost = userPost;
    }

    /**
     * @return 工作职称
     */
    public String getWorkTitle() {
        return workTitle;
    }

    public void setWorkTitle(String workTitle) {
        this.workTitle = workTitle;
    }

    /**
     * @return 工作职位
     */
    public String getWorkPost() {
        return workPost;
    }

    public void setWorkPost(String workPost) {
        this.workPost = workPost;
    }

    /**
     * @return 用户描述
     */
    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc;
    }

    /**
     * @return 工作角色
     */
    public String getWorkRole() {
        return workRole;
    }

    public void setWorkRole(String workRole) {
        this.workRole = workRole;
    }

    /**
     * @return 登录时间
     */
    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * @return 上次登录时间
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * @return 登录次数
     */
    public Long getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Long loginCount) {
        this.loginCount = loginCount;
    }

    /**
     * @return 账号状态(0 : 正常 ， 1 : 禁用)
     */
    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    /**
     * @return 用户过期时间
     */
    public String getUserExpireTime() {
        return userExpireTime;
    }

    public void setUserExpireTime(String userExpireTime) {
        this.userExpireTime = userExpireTime;
    }

    /**
     * @return 密码过期时间
     */
    public String getPasswordExpireTime() {
        return passwordExpireTime;
    }

    public void setPasswordExpireTime(String passwordExpireTime) {
        this.passwordExpireTime = passwordExpireTime;
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
