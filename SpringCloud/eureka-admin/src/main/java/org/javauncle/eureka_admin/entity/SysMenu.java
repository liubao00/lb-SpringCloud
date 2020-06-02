package org.javauncle.eureka_admin.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (SysMenu)实体类
 *
 * @author liubao
 * @since 2020-05-28 16:13:44
 */
public class SysMenu implements Serializable {
    private static final long serialVersionUID = -47620403146706035L;
    /**
    * 主键ID
    */
    private Long id;
    /**
    * 菜单名称
    */
    private String menuName;
    /**
    * 0:目录 1:菜单 2:按钮
    */
    private Integer menuType;
    /**
    * 父级的ID
    */
    private Long parentId;
    /**
    * 菜单URL，类型:1.普通页面 2：嵌套完整外部页面
    */
    private String url;
    /**
    * 授权(多个用逗号分隔，如：sys:user:add,sys:user:edit)',
    */
    private String perms;
    /**
    * 菜单图标
    */
    private String icon;
    /**
    * 排序
    */
    private Integer orderNum;
    /**
    * 是否删除
    */
    private Integer delFlag;
    /**
    * 创建人
    */
    private String createBy;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 更新人
    */
    private String lastUpdateBy;
    /**
    * 更新时间
    */
    private Date lastUpdateTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Integer getMenuType() {
        return menuType;
    }

    public void setMenuType(Integer menuType) {
        this.menuType = menuType;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPerms() {
        return perms;
    }

    public void setPerms(String perms) {
        this.perms = perms;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

}