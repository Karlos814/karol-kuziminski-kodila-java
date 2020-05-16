package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userID;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int quantityOfPosts;

    public ForumUser(final int userID, final char sex, final LocalDate dateOfBirth, final int quantityOfPosts) {
        this.userID = userID;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.quantityOfPosts = quantityOfPosts;
    }

    public int getUserID() {
        return userID;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getQuantityOfPosts() {
        return quantityOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID= " + userID +
                ", sex= " + sex +
                ", dateOfBirth= " + dateOfBirth +
                ", quantityOfPosts= " + quantityOfPosts +
                '}';
    }
}
