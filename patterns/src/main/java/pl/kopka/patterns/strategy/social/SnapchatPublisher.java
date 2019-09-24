package pl.kopka.patterns.strategy.social;

public class SnapchatPublisher implements SocialPublisher {
    @Override
    public String share() {
       return "[Snapchat Publisher]";
    }
}
