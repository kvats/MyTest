package com.impetus.designpattern.command.impl;

import com.impetus.designpattern.command.interfaces.ActionListenerCommand;

/**
 * Concrete Command:
 */
public class ActionOpen implements ActionListenerCommand {
    private Document adoc;

    public ActionOpen(Document doc) {
        this.adoc = doc;
    }

    @Override
    public void execute() {
        adoc.Open();

    }

}
