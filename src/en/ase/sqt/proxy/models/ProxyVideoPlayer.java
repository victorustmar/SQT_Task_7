package en.ase.sqt.proxy.models;

import en.ase.sqt.proxy.abstracts.PlayableVideo;

public class ProxyVideoPlayer implements PlayableVideo {
    private final VideoPlayer realPlayer;

    public ProxyVideoPlayer(VideoPlayer realPlayer) {
        this.realPlayer = realPlayer;
    }

    @Override
    public String playVideo() {
        try {
            return realPlayer.playVideo();
        } catch (NullPointerException e) {
            return "Try again later";
        }
    }
}
