package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TotalStatisticsTestSuite {

    private List<String> generationUsers(int quantity){
        List <String> users = new ArrayList<>();

        for (int i=0; i<quantity; i++){
            users.add("Nazwa"+i);
        }
        return users;
    }

    @Test
    public void testCalculateAdvStatisticsWhenPostIs0(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        TotalStatistics totalStatistics = new TotalStatistics();

        when(statisticsMock.usersNames()).thenReturn(generationUsers(10));

        when(statisticsMock.postsCount()).thenReturn(0);

        when(statisticsMock.commentsCount()).thenReturn(2);

        //When
        totalStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, totalStatistics.getQuantityOfComments());
        Assert.assertEquals(0, totalStatistics.getQuantityOfPosts());
        Assert.assertEquals(10, totalStatistics.getQuantityOfUsers());
        Assert.assertEquals(0, totalStatistics.getQuantityOfCommentsPerPost(), 0.01);
        Assert.assertEquals(0, totalStatistics.getQuantityOfCommentsPerUser(), 0.01);
        Assert.assertEquals(0, totalStatistics.getQuantityOfPostsPerUser(), 0.01);

    }

    @Test
    public void testCalculateAdvStatisticsWhenPostIs1000(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        TotalStatistics totalStatistics = new TotalStatistics();

        when(statisticsMock.usersNames()).thenReturn(generationUsers(10));

        when(statisticsMock.postsCount()).thenReturn(1000);

        when(statisticsMock.commentsCount()).thenReturn(20);

        //When
        totalStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(20, totalStatistics.getQuantityOfComments());
        Assert.assertEquals(1000, totalStatistics.getQuantityOfPosts());
        Assert.assertEquals(10, totalStatistics.getQuantityOfUsers());
        Assert.assertEquals(20/1000.0, totalStatistics.getQuantityOfCommentsPerPost(), 0.01);
        Assert.assertEquals(20/10.0, totalStatistics.getQuantityOfCommentsPerUser(), 0.01);
        Assert.assertEquals(1000/10.0, totalStatistics.getQuantityOfPostsPerUser(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsWhenCommentsIs0(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        TotalStatistics totalStatistics = new TotalStatistics();

        when(statisticsMock.usersNames()).thenReturn(generationUsers(10));

        when(statisticsMock.postsCount()).thenReturn(5);

        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        totalStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, totalStatistics.getQuantityOfComments());
        Assert.assertEquals(5, totalStatistics.getQuantityOfPosts());
        Assert.assertEquals(10, totalStatistics.getQuantityOfUsers());
        Assert.assertEquals(0, totalStatistics.getQuantityOfCommentsPerPost(), 0.01);
        Assert.assertEquals(0, totalStatistics.getQuantityOfCommentsPerUser(), 0.01);
        Assert.assertEquals(5/10.0, totalStatistics.getQuantityOfPostsPerUser(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsWhenCommentsMoreThenPosts(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        TotalStatistics totalStatistics = new TotalStatistics();

        when(statisticsMock.usersNames()).thenReturn(generationUsers(10));

        when(statisticsMock.postsCount()).thenReturn(5);

        when(statisticsMock.commentsCount()).thenReturn(20);

        //When
        totalStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(20, totalStatistics.getQuantityOfComments());
        Assert.assertEquals(5, totalStatistics.getQuantityOfPosts());
        Assert.assertEquals(10, totalStatistics.getQuantityOfUsers());
        Assert.assertEquals(20/5.0, totalStatistics.getQuantityOfCommentsPerPost(), 0.01);
        Assert.assertEquals(20/10.0, totalStatistics.getQuantityOfCommentsPerUser(), 0.01);
        Assert.assertEquals(5/10.0, totalStatistics.getQuantityOfPostsPerUser(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsWhenPostsMoreThenComments(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        TotalStatistics totalStatistics = new TotalStatistics();

        when(statisticsMock.usersNames()).thenReturn(generationUsers(10));

        when(statisticsMock.postsCount()).thenReturn(20);

        when(statisticsMock.commentsCount()).thenReturn(5);

        //When
        totalStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(5, totalStatistics.getQuantityOfComments());
        Assert.assertEquals(20, totalStatistics.getQuantityOfPosts());
        Assert.assertEquals(10, totalStatistics.getQuantityOfUsers());
        Assert.assertEquals(5/20.0, totalStatistics.getQuantityOfCommentsPerPost(), 0.01);
        Assert.assertEquals(5/10.0, totalStatistics.getQuantityOfCommentsPerUser(), 0.01);
        Assert.assertEquals(20/10.0, totalStatistics.getQuantityOfPostsPerUser(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsWhenUsersIs0(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        TotalStatistics totalStatistics = new TotalStatistics();

        when(statisticsMock.usersNames()).thenReturn(generationUsers(0));

        when(statisticsMock.postsCount()).thenReturn(20);

        when(statisticsMock.commentsCount()).thenReturn(5);

        //When
        totalStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(5, totalStatistics.getQuantityOfComments());
        Assert.assertEquals(20, totalStatistics.getQuantityOfPosts());
        Assert.assertEquals(0, totalStatistics.getQuantityOfUsers());
        Assert.assertEquals(5/20.0, totalStatistics.getQuantityOfCommentsPerPost(), 0.01);
        Assert.assertEquals(0, totalStatistics.getQuantityOfCommentsPerUser(), 0.01);
        Assert.assertEquals(0, totalStatistics.getQuantityOfPostsPerUser(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsWhenUsersIs100(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        TotalStatistics totalStatistics = new TotalStatistics();

        when(statisticsMock.usersNames()).thenReturn(generationUsers(100));

        when(statisticsMock.postsCount()).thenReturn(20);

        when(statisticsMock.commentsCount()).thenReturn(5);

        //When
        totalStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(5, totalStatistics.getQuantityOfComments());
        Assert.assertEquals(20, totalStatistics.getQuantityOfPosts());
        Assert.assertEquals(100, totalStatistics.getQuantityOfUsers());
        Assert.assertEquals(5/20.0, totalStatistics.getQuantityOfCommentsPerPost(), 0.01);
        Assert.assertEquals(5/100.0, totalStatistics.getQuantityOfCommentsPerUser(), 0.01);
        Assert.assertEquals(20/100., totalStatistics.getQuantityOfPostsPerUser(), 0.01);
    }
}
