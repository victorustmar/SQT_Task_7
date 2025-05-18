package en.ase.sqt.proxy.client;

import en.ase.sqt.proxy.abstracts.PlayableVideo;
import en.ase.sqt.proxy.models.ProxyVideoPlayer;
import en.ase.sqt.proxy.models.VideoPlayer;

public class Marketing {
    public static void main(String[] args) throws InterruptedException {
        VideoPlayer videoPlayer = new VideoPlayer("Kebap marketing.mp4");

        PlayableVideo videoProxy = new ProxyVideoPlayer(videoPlayer);

        System.out.println(videoProxy.playVideo());

        Thread.sleep(10000);

        System.out.println("Playing: " + videoProxy.playVideo());
        System.out.println("Done!");
    }
}
