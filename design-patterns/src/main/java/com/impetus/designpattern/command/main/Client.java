package com.impetus.designpattern.command.main;

import com.impetus.designpattern.command.impl.ActionOpen;
import com.impetus.designpattern.command.impl.ActionSave;
import com.impetus.designpattern.command.impl.Document;
import com.impetus.designpattern.command.impl.MenuOptions;
import com.impetus.designpattern.command.interfaces.ActionListenerCommand;

/**
 * Client class:
 */
public class Client {
    public static void main(String[] args) {
        Document doc = new Document();
        ActionListenerCommand clickOpen = new ActionOpen(doc);
        ActionListenerCommand clickSave = new ActionSave(doc);
        MenuOptions menu = new MenuOptions(clickOpen, clickSave);
        menu.clickOpen();
        menu.clickSave();
    }

}
