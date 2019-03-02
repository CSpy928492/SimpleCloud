package cspy.online.bean;

public class FileTable {
    private Integer id;

    private String gmtCreate;

    private String gmtModified;

    private Integer uid;

    private String filePath;

    private String fileName;

    private String filePathOriginal;

    private String md5;

    private Byte fileValid;

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

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePathOriginal() {
        return filePathOriginal;
    }

    public void setFilePathOriginal(String filePathOriginal) {
        this.filePathOriginal = filePathOriginal;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public Byte getFileValid() {
        return fileValid;
    }

    public void setFileValid(Byte fileValid) {
        this.fileValid = fileValid;
    }
}