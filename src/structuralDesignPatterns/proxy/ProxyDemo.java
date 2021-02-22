package structuralDesignPatterns.proxy;

import structuralDesignPatterns.proxy.downloader.YouTubeDownloader;
import structuralDesignPatterns.proxy.proxy.YouTubeCacheProxy;
import structuralDesignPatterns.proxy.some_cool_media_library.ThirdPartYoutubeClass;

public class ProxyDemo {
    public static void main(String[] args) {
        YouTubeDownloader nativeDownloader = new YouTubeDownloader(new ThirdPartYoutubeClass());
        YouTubeDownloader smartDownloader = new YouTubeDownloader(new YouTubeCacheProxy());

        long naive = test(nativeDownloader);
        long smart = test(smartDownloader);
        System.out.println("Time saved by caching structuralDesignPatterns.proxy: " + (naive - smart) + "ms");
    }

    private static long test(YouTubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        //User behavior in out app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");
        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}
