package pl.coderslab.warstat3krajee04.model;

import org.mindrot.jbcrypt.BCrypt;

public class User {
    private int id;
    private String username;
    private String email;
    private String password;
    private int userGroupId;
    private String usersGroup;

    public User() {
    }

    public User(int id, String username, String email, String password, int userGroupId, String usersGroup) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.userGroupId = userGroupId;
        this.usersGroup = usersGroup;
    }

    public User(String username, String email, String password, int userGroupId) {
        this.username = username;
        this.email = email;
        setPassword(password);
        this.userGroupId = userGroupId;
    }

    public User(int id, String username, String email, String password, int userGroupId) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.userGroupId = userGroupId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", userGroupId=" + userGroupId +
                '}';
    }

    public String getUsersGroup() {
        return usersGroup;
    }

    public void setUsersGroup(String usersGroup) {
        this.usersGroup = usersGroup;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = BCrypt.hashpw(password, BCrypt.gensalt());
    }

    public void setPasswordString(String password) {
        this.password = password;
    }
    public int getUserGroupId() {
        return userGroupId;
    }

    public void setUserGroupId(int userGroupId) {
        this.userGroupId = userGroupId;
    }
}
