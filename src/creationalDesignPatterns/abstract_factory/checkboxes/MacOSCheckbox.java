package creationalDesignPatterns.abstract_factory.checkboxes;

import creationalDesignPatterns.abstract_factory.buttons.Button;

/**
 * All products families have the same varieties (MacOS/Windows).
 * <p>
 * This is another variant of a Checkbox.
 */
public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have create MacOSCheckbox");
    }
}
