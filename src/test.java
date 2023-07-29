import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Objects;

public class test {
    private int age;
    private String name;

    public test(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        test test = (test) o;
        return age == test.age && Objects.equals(name, test.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
