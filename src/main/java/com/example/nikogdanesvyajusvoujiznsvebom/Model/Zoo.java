package com.example.nikogdanesvyajusvoujiznsvebom.Model;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Zoo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;
    @NotBlank(message = "Поле не может быть пустым")
    @Size(min = 1, max = 250, message = "Поле должно содержать от 1 до 250 символов")
    public String description;
    @NotBlank(message = "Поле не может быть пустым")
    @Size(min = 1, max = 30, message = "Поле должно содержать от 1 до 30 символов")
    public String name;
    @NotNull(message = "Заполните поле")
    @Max(value = 2000, message ="Возраст не может быть больше 2000 лет")
    public int age;
    @NotNull(message = "Заполните поле")
    @Min(value = 1, message ="Рост животного не может быть меньше 1" )
    public int height;
    @NotNull(message = "Заполните поле")
    @Min(value = 1, message ="Вес животного не может быть меньше 1" )
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
