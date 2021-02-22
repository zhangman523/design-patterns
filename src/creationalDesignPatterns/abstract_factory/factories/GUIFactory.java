package creationalDesignPatterns.abstract_factory.factories;


import creationalDesignPatterns.abstract_factory.buttons.Button;
import creationalDesignPatterns.abstract_factory.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}
