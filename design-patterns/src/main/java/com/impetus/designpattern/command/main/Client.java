package com.impetus.designpattern.behavioural.command.main;

import com.impetus.designpattern.behavioural.command.impl.ActionOpen;
import com.impetus.designpattern.behavioural.command.impl.ActionSave;
import com.impetus.designpattern.behavioural.command.impl.Document;
import com.impetus.designpattern.behavioural.command.impl.MenuOptions;
import com.impetus.designpattern.behavioural.command.interfaces.ActionListenerCommand;


/**
Client class:
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
