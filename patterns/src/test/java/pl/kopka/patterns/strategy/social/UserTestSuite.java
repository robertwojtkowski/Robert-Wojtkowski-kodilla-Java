package pl.kopka.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies(){
        User fb = new YGeneration("FB");
        User tw = new Millenials("TW");
        User snap = new ZGeneration("SNAP");

        Assert.assertEquals(fb.sharePost("TEST post"), "[Facebook Publisher] Post content: TEST post");
        Assert.assertEquals(tw.sharePost("TEST post"), "[Twitter Publisher] Post content: TEST post");
        Assert.assertEquals(snap.sharePost("TEST post"), "[Snapchat Publisher] Post content: TEST post");

    }

    @Test
    public void testIndividualSharingStrategy(){
        User fb_to_snap = new YGeneration("FB to Snap");

        System.out.println(fb_to_snap.sharePost("Post from FB"));

        fb_to_snap.setSocialPublisher(new SnapchatPublisher());
        System.out.println(fb_to_snap.sharePost("Post from Snap"));

        Assert.assertEquals(fb_to_snap.sharePost("Post from Snap"), "[Snapchat Publisher] Post content: Post from Snap");

    }
}
