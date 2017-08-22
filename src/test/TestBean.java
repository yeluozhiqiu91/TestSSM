import java.io.Serializable;

/**
 * Created by wang on 2017/8/22.
 */
public class TestBean implements Serializable {
    private String name;
    private int age;

    private String idcard;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }
}
