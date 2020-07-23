package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User tomek = new Millenials("Tomasz Wons");
        User krzys = new YGeneration("Krzysztof Grzyb");
        User maro = new ZGeneration("Marek Iks");

        //When
        String tomekSocial = tomek.sharePost();
        String krzysSocial = krzys.sharePost();
        String maroSocial = maro.sharePost();

        //Then
        Assert.assertEquals("I use FaceBook", tomekSocial);
        Assert.assertEquals("I use Twitter", krzysSocial);
        Assert.assertEquals("I use Snapchat", maroSocial);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User krzys = new YGeneration("Krzysztof Grzyb");

        //When
        krzys.setSocialPublisher(new SnapchatPublisher());
        String krzysSocial = krzys.sharePost();

        //Then
        Assert.assertEquals("I use Snapchat", krzysSocial);
    }
}
