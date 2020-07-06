package com.kodilla.testing.forum.statistics;

public class TotalStatistics {

    private int quantityOfUsers;
    private int quantityOfPosts;
    private int quantityOfComments;
    private double quantityOfPostsPerUser;
    private double quantityOfCommentsPerUser;
    private double quantityOfCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        quantityOfUsers = statistics.usersNames().size();
        quantityOfPosts = statistics.postsCount();
        if (quantityOfPosts == 0) {
            quantityOfComments = 0;
        } else {
            quantityOfComments = statistics.commentsCount();
        }

        //średnią liczbę postów na użytkownika
        if (quantityOfUsers == 0 || quantityOfPosts == 0) {
            quantityOfPostsPerUser = 0.0;
        } else {
            quantityOfPostsPerUser = quantityOfPosts / (double) quantityOfUsers;
        }

        //średnią liczbę komentarzy na użytkownika
        if (quantityOfUsers == 0 || quantityOfComments == 0) {
            quantityOfCommentsPerUser = 0.0;
        } else {
            quantityOfCommentsPerUser = quantityOfComments / (double) quantityOfUsers;
        }

        //średnią liczbę komentarzy na post
        if (quantityOfPosts == 0 || quantityOfComments == 0) {
            quantityOfCommentsPerPost = 0.0;
        } else {
            quantityOfCommentsPerPost = quantityOfComments / (double) quantityOfPosts;
        }
    }

    public void showStatistics() {
        System.out.println("Liczba użytkowników: " + quantityOfUsers);
        System.out.println("Liczba postów: " + quantityOfPosts);
        System.out.println("Liczba komentarzy: " + quantityOfComments);
        System.out.println("Średnią liczbę postów na użytkownika: " + quantityOfPostsPerUser);
        System.out.println("Średnią liczbę komentarzy na użytkownika: " + quantityOfCommentsPerUser);
        System.out.println("Średnią liczbę komentarzy na post: " + quantityOfCommentsPerPost);
    }

    public int getQuantityOfUsers() {
        return quantityOfUsers;
    }

    public int getQuantityOfPosts() {
        return quantityOfPosts;
    }

    public int getQuantityOfComments() {
        return quantityOfComments;
    }

    public double getQuantityOfPostsPerUser() {
        return quantityOfPostsPerUser;
    }

    public double getQuantityOfCommentsPerUser() {
        return quantityOfCommentsPerUser;
    }

    public double getQuantityOfCommentsPerPost() {
        return quantityOfCommentsPerPost;
    }
}
