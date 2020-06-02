package org.javauncle.eureka_admin.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (SysDict)实体类
 *
 * @author liubao
 * @since 2020-05-28 16:13:44
 */
public class SysDict implements Serializable {
    private static final long serialVersionUID = -93318483424397614L;
    /**
    * 主键ID
    */
    private Long id;
    /**
    * 数据值
    */
    private String value;
    /**
    * 标签名
    */
    private String label;
    /**
    * 类型
    */
    private String type;
    /**
    * 描述
    */
    private String description;
    /**
    * 排序
    */
    private Double sort;
    /**
    * 备注信息
    */
    private String remarks;
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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getSort() {
        return sort;
    }

    public void setSort(Double sort) {
        this.sort = sort;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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