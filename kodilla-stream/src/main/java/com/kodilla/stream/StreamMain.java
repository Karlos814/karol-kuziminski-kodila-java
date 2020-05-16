package com.kodilla.stream;


import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {


        Forum usersList = new Forum();
        Map<Integer, ForumUser> par = usersList.getUserList().stream()
                .filter(m -> m.getSex()==('M'))
                .filter(age -> ChronoUnit.YEARS.between(age.getDateOfBirth(), LocalDate.now()) >= 20)
                .filter(post -> post.getQuantityOfPosts()>0)
                .collect(Collectors.toMap(ForumUser::getUserID, user -> user));

        System.out.println("# elements: " + par.size());
        par.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
