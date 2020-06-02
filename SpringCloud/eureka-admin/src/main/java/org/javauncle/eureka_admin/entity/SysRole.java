package org.javauncle.eureka_admin.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (SysRole)实体类
 *
 * @author liubao
 * @since 2020-05-28 16:13:44
 */
public class SysRole implements Serializable {
    private static final long serialVersionUID = -49742395864436318L;
    /**
    * 主键ID
    */
    private Long id;
    /**
    * 角色名称
    */
    private String roleName;
    /**
    * 角色状态
    */
    private Integer state;
    /**
    * 是否删除
    */
    private Integer delFlag;
    /**
    * 备注
    */
    private String remark;
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

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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