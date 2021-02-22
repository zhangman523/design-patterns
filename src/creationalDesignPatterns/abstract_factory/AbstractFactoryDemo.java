package creationalDesignPatterns.abstract_factory;

import creationalDesignPatterns.abstract_factory.app.Application;
import creationalDesignPatterns.abstract_factory.factories.GUIFactory;
import creationalDesignPatterns.abstract_factory.factories.MacOSFactory;
import creationalDesignPatterns.abstract_factory.factories.WindowsFactory;

public class AbstractFactoryDemo {
    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
