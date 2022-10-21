package com.example.nikogdanesvyajusvoujiznsvebom.Model;

import javax.persistence.*;

@Entity
public class Zoo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;
    public String description;
    public String name;
    public int age;
    public int height;
    public int weight;

    public Zoo(String description, String name, int age, int height, int weight) {
        this.id = id;
        this.description = description;
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Zoo() {

    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
