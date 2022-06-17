package Golestan.Student.entry;

public class StudentEntity {
    private long username , password;
    private String pass , name;

    public long getUsername() {
        return username;
    }

    public StudentEntity setUsername(long username) {
        this.username = username;
        return this;
    }

    public String getName() {
        return name;
    }

    public StudentEntity setName(String name) {
        this.name = name;
        return this;
    }

    public long getPassword() {
        return password;
    }

    public StudentEntity setPassword(long password) {
        this.password = password;
        return this;
    }

    public String getPass() {
        return pass;
    }

    public StudentEntity setPass(String pass) {
        this.pass = pass;
        return this;
    }
}
