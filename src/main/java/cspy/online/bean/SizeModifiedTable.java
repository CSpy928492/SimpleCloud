package cspy.online.bean;

public class SizeModifiedTable {
    private Integer id;

    private String gmtCreate;

    private String gmtModified;

    private Integer uid;

    private Integer sizeChanged;

    private String remarks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getSizeChanged() {
        return sizeChanged;
    }

    public void setSizeChanged(Integer sizeChanged) {
        this.sizeChanged = sizeChanged;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}