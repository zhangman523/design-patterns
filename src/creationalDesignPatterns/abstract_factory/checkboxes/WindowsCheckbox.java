package creationalDesignPatterns.abstract_factory.checkboxes;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is another variant of a Checkbox.
 */
public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have create WindowsCheckbox");
    }
}
