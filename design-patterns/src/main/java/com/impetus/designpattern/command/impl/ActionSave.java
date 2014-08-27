package com.impetus.designpattern.command.impl;

import com.impetus.designpattern.command.interfaces.ActionListenerCommand;

/**
 * Concrete Command:
 */
public class ActionSave implements ActionListenerCommand {

    private Document adoc;

    public ActionSave(Document doc) {
        this.adoc = doc;
    }

    @Override
    public void execute() {
        adoc.Save();

    }

}
