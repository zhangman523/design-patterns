package creationalDesignPatterns.abstract_factory.app;

import creationalDesignPatterns.abstract_factory.buttons.Button;
import creationalDesignPatterns.abstract_factory.checkboxes.Checkbox;
import creationalDesignPatterns.abstract_factory.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
