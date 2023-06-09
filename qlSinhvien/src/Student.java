// import your libraries
import java.lang.*;

public class Student {
    private String name;
    private String id;
    private String group;
    private String email;


    Student() {

        String name;
        String id;
        String group;
        String email;
        name = "Student";
        id = "000";
        group = "K62CB";
        email = "uet@vnu.edu.vn";
    }

    Student (String name, String id, String email){
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = "K62CB";
    }

    Student (Student s){
        this.name = s.name;
        this.id = s.id;
        this.email = s.email;
        this.group = s.group;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
    public String getInfo() {
        return name + " - " + id + " - " + group + " - " + email;
    }

    public static void main(String[] args) {

    }
}
