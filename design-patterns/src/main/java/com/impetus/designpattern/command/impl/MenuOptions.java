package com.impetus.designpattern.command.impl;

import com.impetus.designpattern.command.interfaces.ActionListenerCommand;

/**
 * Invoker class:
 */
public class MenuOptions {
    private ActionListenerCommand openCommand;
    private ActionListenerCommand saveCommand;

    public MenuOptions(ActionListenerCommand open, ActionListenerCommand save) {
        this.openCommand = open;
        this.saveCommand = save;
    }

    public void clickOpen() {
        openCommand.execute();
    }

    public void clickSave() {
        saveCommand.execute();
    }
}
