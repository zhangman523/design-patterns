package structuralDesignPatterns.facade;

import structuralDesignPatterns.facade.facade.VideoConversionFacade;

import java.io.File;

public class FacadeDemo {
    public static void main(String[] args) {
        VideoConversionFacade conversionFacade = new VideoConversionFacade();
        File mp4Video = conversionFacade.convertVideo("youtubevideo.oog","mp4");

    }
}
