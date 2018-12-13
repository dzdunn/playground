import java.util.Date;

public class MyType {

    private String name;
    private Integer age;
    private Date dob;

    public MyType(String name, Integer age, Date dob){
        this.name = name;
        this.age = age;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Date getDob() {
        return dob;
    }
}
