package Golestan.teacher.Entry;

public class TeacherEntity {
    private long id , user;
    private String password , name;

    public String getName() {
        return name;
    }

    public TeacherEntity setName(String name) {
        this.name = name;
        return this;
    }

    public long getId() {
        return id;
    }

    public TeacherEntity setId(long id) {
        this.id = id;
        return this;
    }

    public TeacherEntity setUser(long user) {
        this.user = user;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public TeacherEntity setPassword(String password) {
        this.password = password;
        return this;
    }
}
