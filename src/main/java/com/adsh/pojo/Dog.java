package com.adsh.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "dog")
public class Dog {
//    @Value("旺财")
    private String fullname;
//    @Value("3")
    private Integer age;

    public Dog() {
    }

    public Dog(String fullname, Integer age) {
        this.fullname = fullname;
        this.age = age;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "fullname='" + fullname + '\'' +
                ", age=" + age +
                '}';
    }
}
