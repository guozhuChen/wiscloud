package com.wiscloud.model;

import java.util.Date;

/**
 * Created by Leslie on 2017/4/22.
 */
public class SysMenu {
    private Integer menuId ;    //菜单主键
    private Integer parentId ;  //上级菜单Id  第一层parentId=0
    private String name ;       //菜单名称   NOT NULL
    private String url ;        //菜单URL
    private String icon ;       //菜单图标
    private String des ;        //菜单描述
    private Date createTime ;   //创建时间
    private String createor ;   //创建人
    private Date updateTime ;   //修改时间
    private String updateor ;   //修改人

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateor() {
        return createor;
    }

    public void setCreateor(String createor) {
        this.createor = createor;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateor() {
        return updateor;
    }

    public void setUpdateor(String updateor) {
        this.updateor = updateor;
    }
}
