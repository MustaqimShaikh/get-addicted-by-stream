package stream1;

import java.util.Arrays;
import java.util.List;

public class People {

   public String name;
   public Integer age;
   public String gender;

    public People(String name, Integer age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public People() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static List<People> getPeoples() {
        return Arrays.asList(
                new People("Sara", 20, "female"),
                new People("Sara", 20, "female"),
                new People("Sara", 22, "female"),
                new People("Bob", 20, "male"),
                new People("Paula", 32, "female"),
                new People("Paul", 32, "male"),
                new People("Jack", 3, "male"),
                new People("Jack", 72, "male"),
                new People("Jill", 11, "male"));
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
