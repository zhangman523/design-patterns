package structuralDesignPatterns.proxy.some_cool_media_library;

import java.util.HashMap;

public class ThirdPartYoutubeClass implements ThirdPartyYouTubeLib {

    @Override
    public HashMap<String, Video> popularVideos() {
        connectToServer("http://www.youtube.com");
        return getRandomVideos();
    }

    @Override
    public Video getVideo(String videoId) {
        connectToServer("http://www.youtube.com/" + videoId);
        return getSomeVideo(videoId);
    }

    private int random(int min, int max) {
        return min + (int) (Math.random()) * ((max - min) + 1);
    }

    private void experienceNetworkLatency() {
        int randomLatency = random(5, 10);
        for (int i = 0; i < randomLatency; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void connectToServer(String server) {
        System.out.println("Connecting to " + server + "...");
        experienceNetworkLatency();
        System.out.println("Connected!\n");
    }

    private HashMap<String, Video> getRandomVideos() {
        System.out.println("Downloading populars... ");
        experienceNetworkLatency();
        HashMap<String, Video> hashMap = new HashMap<>();
        hashMap.put("catzzzzzzzzz", new Video("sadgahasgdas", "Catzzzz.avi"));
        hashMap.put("mkafksangasj", new Video("mkafksangasj", "Dog play with ball.mp4"));
        hashMap.put("dancesvideoo", new Video("asdfas3ffasd", "Dancing video.mpq"));
        hashMap.put("dlsdk5jfslaf", new Video("dlsdk5jfslaf", "Barcelona vs RealM.mov"));
        hashMap.put("3sdfgsd1j333", new Video("3sdfgsd1j333", "Programing lesson#1.avi"));
        System.out.println("Done!\n");
        return hashMap;
    }

    private Video getSomeVideo(String videoId) {
        System.out.println("Downloading video...");
        experienceNetworkLatency();
        Video video = new Video(videoId, "Some video title");

        System.out.println("Done!\n");
        return video;
    }

}
