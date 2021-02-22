package creationalDesignPatterns.factory_method.factory;

import creationalDesignPatterns.factory_method.buttons.Button;
import creationalDesignPatterns.factory_method.buttons.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
