package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.math.BigDecimal;

public class SysPhotoEntity {
    private BigDecimal photoCode;

    private String photoName;

    private String photoPath;

    private String uploadTime;

    public BigDecimal getPhotoCode() {
        return photoCode;
    }

    public void setPhotoCode(BigDecimal photoCode) {
        this.photoCode = photoCode;
    }

    public String getPhotoName() {
        return photoName;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath == null ? null : photoPath.trim();
    }

    public String getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime == null ? null : uploadTime.trim();
    }
}