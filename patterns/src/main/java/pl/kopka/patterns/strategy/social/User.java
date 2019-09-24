package pl.kopka.patterns.strategy.social;

public class User {
    private String name;
    protected SocialPublisher socialPublisher;

    public User(String name) {
        this.name = name;
    }


    public String  sharePost(String content){
        return socialPublisher.share() + " Post content: " + content;
    }

    public SocialPublisher getSocialPublisher() {
        return socialPublisher;
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
