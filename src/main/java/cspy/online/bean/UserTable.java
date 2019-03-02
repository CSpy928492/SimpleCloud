package cspy.online.bean;

import org.springframework.stereotype.Component;

@Component
public class UserTable {
    private Integer id;

    private String gmtCreate;

    private String gmtModified;

    private String username;

    private String email;

    private Byte emailValid;

    private String call;

    private Byte callValid;

    private Byte userValid;

    private String password;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Byte getEmailValid() {
        return emailValid;
    }

    public void setEmailValid(Byte emailValid) {
        this.emailValid = emailValid;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public Byte getCallValid() {
        return callValid;
    }

    public void setCallValid(Byte callValid) {
        this.callValid = callValid;
    }

    public Byte getUserValid() {
        return userValid;
    }

    public void setUserValid(Byte userValid) {
        this.userValid = userValid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}