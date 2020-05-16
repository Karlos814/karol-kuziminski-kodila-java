package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, 'M', LocalDate.of(2000, 12, 12),
                2));
        userList.add(new ForumUser(2, 'F', LocalDate.of(2005, 11, 2),
                20));
        userList.add(new ForumUser(3, 'M', LocalDate.of(1992, 7, 11),
                1));
        userList.add(new ForumUser(4, 'M', LocalDate.of(2016, 1, 22),
                0));
        userList.add(new ForumUser(5, 'F', LocalDate.of(1993, 8, 18),
                0));
        userList.add(new ForumUser(6, 'M', LocalDate.of(1983, 4, 25),
                3));
        userList.add(new ForumUser(7, 'F', LocalDate.of(1988, 6, 10),
                6));
        userList.add(new ForumUser(8, 'M', LocalDate.of(1946, 10, 30),
                0));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
