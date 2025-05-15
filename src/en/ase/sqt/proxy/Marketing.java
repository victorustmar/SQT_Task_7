package en.ase.sqt.proxy;

import en.ase.sqt.proxy.abstracts.PlayableVideo;
import en.ase.sqt.proxy.models.ProxyVideoPlayer;

public class Marketing {
    public static void main(String[] args) {
        PlayableVideo playableVideo=new ProxyVideoPlayer("kebap");
        playableVideo.play();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        playableVideo.play();

    }
}
