package com.example.nikogdanesvyajusvoujiznsvebom.Model;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Set;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank(message = "Поле не должно быть пустым!")
    @Size(min = 5, max = 30, message = "Поле должно содержать от 5 до 30 символов")
    private String username;
    @Pattern(regexp = "^(?=.*[0-9])" +
            "(?=.*[a-z])" +
            "(?=.*[A-Z])" +
            "(?=.*[!@#$%^&+=])" +
            "(?=\\S+$)" +
            ".{6,}", message = "Пароль должен быть не меньше 6 символов,"+ "\n" +
            "иметь числа и латинкие строчные и заглавные буквы," + "\n" +
            "а также специальные символы ")
    private String password;

    private Boolean active;

    @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"))
    @Enumerated(EnumType.STRING)
    private Set<Role> roles;

    @NotBlank(message = "Поле не должно быть пустым!")
    @Size(min = 1, max = 150, message = "Поле должно содержать от 1 до 150 символов")
    private String name;

    public Employee(String username, String password, Boolean active, Set<Role> roles, String name) {
        this.username = username;
        this.password = password;
        this.active = active;
        this.roles = roles;
        this.name = name;
    }

    public Employee() {}

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Boolean getActive() {
        return active;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public void setName(String name) {
        this.name = name;
    }
}