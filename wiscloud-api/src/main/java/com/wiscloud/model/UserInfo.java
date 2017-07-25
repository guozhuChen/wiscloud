package com.wiscloud.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Leslie on 2017/4/9.
 */
public class UserInfo implements Serializable{
    private Integer userId ;   //用户ID  主键
    private String loginName ; //用户登录名 NOT NULL 唯一索引
    private String password ;  //密码  NOT NULL
    private String salt ;      //密码种子(随机数)
    private String userName ;  //昵称
    private String icon ;      //头像
    private Integer roleId ;   //用户角色  关联user_role
    private Integer status ;   //用户状态  0:未启用1:正常使用2:已禁用
    private Integer persionId ;  //用户个人基本信息 关联person_info
    private Date createTime ;    //创建/注册时间
    private String secreteQuestion ; //秘密问题  用于找回账号密码
    private String secreteAnswer ; //密码答案

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPersionId() {
        return persionId;
    }

    public void setPersionId(Integer persionId) {
        this.persionId = persionId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getSecreteQuestion() {
        return secreteQuestion;
    }

    public void setSecreteQuestion(String secreteQuestion) {
        this.secreteQuestion = secreteQuestion;
    }

    public String getSecreteAnswer() {
        return secreteAnswer;
    }

    public void setSecreteAnswer(String secreteAnswer) {
        this.secreteAnswer = secreteAnswer;
    }
}
