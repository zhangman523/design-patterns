package creationalDesignPatterns.abstract_factory.factories;

import creationalDesignPatterns.abstract_factory.buttons.Button;
import creationalDesignPatterns.abstract_factory.buttons.MacOSButton;
import creationalDesignPatterns.abstract_factory.buttons.WindowsButton;
import creationalDesignPatterns.abstract_factory.checkboxes.Checkbox;
import creationalDesignPatterns.abstract_factory.checkboxes.MacOSCheckbox;
import creationalDesignPatterns.abstract_factory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
