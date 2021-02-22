package behavioralDesignPatterns.observer;

import behavioralDesignPatterns.observer.editor.Editor;
import behavioralDesignPatterns.observer.listeners.EmailNotificationListener;
import behavioralDesignPatterns.observer.listeners.LogOpenListener;

public class ObserverDemo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("temp/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@exmaple.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
