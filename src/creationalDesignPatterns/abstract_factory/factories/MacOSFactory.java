package creationalDesignPatterns.abstract_factory.factories;

import creationalDesignPatterns.abstract_factory.buttons.Button;
import creationalDesignPatterns.abstract_factory.buttons.MacOSButton;
import creationalDesignPatterns.abstract_factory.checkboxes.Checkbox;
import creationalDesignPatterns.abstract_factory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
