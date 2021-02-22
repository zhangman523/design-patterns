package creationalDesignPatterns.factory_method.factory;

import creationalDesignPatterns.factory_method.buttons.Button;
import creationalDesignPatterns.factory_method.buttons.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
