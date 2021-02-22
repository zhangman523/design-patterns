package behavioralDesignPatterns.command.commands;

import behavioralDesignPatterns.command.editor.Editor;

/**
 * 抽象基础命令
 */
public abstract class Command {
    public Editor editor;
    private String backup;

    public Command(Editor editor) {
        this.editor = editor;
    }

    void backup(){
        backup = editor.textField.getText();
    }

    public void undo(){
        editor.textField.setText(backup);
    }

    public abstract boolean execute();
}
