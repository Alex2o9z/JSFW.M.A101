import java.io.Serializable;

public class Pet implements Serializable {
    String name;
    String type;
    int age;

    public static void makeNoise() {

    }

    @Override
    public String toString() {
        return "Pet [type=" + type + ", name=" + name + ", age=" + age + "]";
    }

}
