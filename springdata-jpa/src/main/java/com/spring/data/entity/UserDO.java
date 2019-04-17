package com.spring.data.entity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "fun_user")
public class UserDO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 证件类型
     */
    @Column(name = "certificate_type")
    private String certificateType;

    /**
     * 证件号码
     */
    @Column(name = "certificate_num")
    private String certificateNum;

    /**
     * 用户姓名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 图片url
     */
    @Column(name = "photo_url")
    private String photoUrl;
    /**
     * 人脸信息状态，0 未录入，1已录入
     */
    @Column(name = "face_status")
    private Boolean faceStatus;

    @Column(name = "create_by")
    private String createBy;

    @Column(name = "create_time", insertable = false, updatable = false)
    private Date createTime;

    @Column(name = "update_by")
    private String updateBy;

    @Column(name = "user_type")
    private Integer userType;

    @Column(name = "update_time", updatable = false)
    private Date updateTime;

    private Boolean actived;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取手机号码
     *
     * @return phone - 手机号码
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号码
     *
     * @param phone 手机号码
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取证件类型
     *
     * @return certificate_type - 证件类型
     */
    public String getCertificateType() {
        return certificateType;
    }

    /**
     * 设置证件类型
     *
     * @param certificateType 证件类型
     */
    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }

    /**
     * 获取证件号码
     *
     * @return certificate_num - 证件号码
     */
    public String getCertificateNum() {
        return certificateNum;
    }

    /**
     * 设置证件号码
     *
     * @param certificateNum 证件号码
     */
    public void setCertificateNum(String certificateNum) {
        this.certificateNum = certificateNum;
    }

    /**
     * 获取用户姓名
     *
     * @return user_name - 用户姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户姓名
     *
     * @param userName 用户姓名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取图片url
     *
     * @return photo_url - 图片url
     */
    public String getPhotoUrl() {
        return photoUrl;
    }

    /**
     * 设置图片url
     *
     * @param photoUrl 图片url
     */
    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    /**
     * @return create_by
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * @param createBy
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_by
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * @param updateBy
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return actived
     */
    public Boolean getActived() {
        return actived;
    }

    /**
     * @param actived
     */
    public void setActived(Boolean actived) {
        this.actived = actived;
    }

    public Boolean getFaceStatus() {
        return faceStatus;
    }

    public void setFaceStatus(Boolean faceStatus) {
        this.faceStatus = faceStatus;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }
}