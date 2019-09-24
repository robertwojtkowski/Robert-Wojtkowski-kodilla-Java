package pl.kopka.patterns.strategy.social;

public class TwitterPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "[Twitter Publisher]";
    }
}
