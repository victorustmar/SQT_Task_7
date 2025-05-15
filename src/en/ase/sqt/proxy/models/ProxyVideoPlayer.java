package en.ase.sqt.proxy.models;

import en.ase.sqt.proxy.abstracts.PlayableVideo;

public class ProxyVideoPlayer implements PlayableVideo {
    private final VideoPlayer videoPlayer;
    private final String name;
    private boolean isRendered = false;

    public ProxyVideoPlayer(String name) {
        this.videoPlayer = new VideoPlayer(name);
        this.name = name;



        Thread thread = new Thread(() -> {
            while (!this.isRendered) {
                try {
                    Thread.sleep(500);

                    String text = this.videoPlayer.playVideo();
                    if (text.equals(this.name)) {
                        this.isRendered = true;
                    }
                } catch (Exception ignored) {
                }
            }
        });
        thread.start();
    }



    @Override
    public void play() {
        if (isRendered) {
            System.out.println(" we play this  "+videoPlayer.playVideo());
        } else {
            System.out.println(" try again");
        }
    }
}
