package com.kodilla.good.patterns.challenges;

public class User {
    private String name;
    private String surname;
    private String login;
    private String email;

    public User(String name, String surname, String login, String email) {
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }
}
