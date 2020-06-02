package org.javauncle.eureka_admin.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (SysDeptRole)实体类
 *
 * @author liubao
 * @since 2020-05-28 16:13:44
 */
public class SysDeptRole implements Serializable {
    private static final long serialVersionUID = -59771903603176676L;
    /**
    * 主键ID
    */
    private Long id;
    /**
    * 部门ID
    */
    private Long deptId;
    /**
    * 用户ID
    */
    private Long roleId;
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

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
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