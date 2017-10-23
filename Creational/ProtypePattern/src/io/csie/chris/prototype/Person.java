package io.csie.chris.prototype;

import io.csie.chris.prototype.common.IPrototype;

public class Person implements IPrototype {

    private String name;
    private String id;
    private int age;

    public Person(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Make a copy from io.csie.chris.prototype.common.IPrototype
    @Override
    public IPrototype doClone() {
        return new Person(name, id, age);
    }

    public String displayInfo() {
        return "This person's name is:" + name + ", id:" + id + ", age:" + age;
    }
}
