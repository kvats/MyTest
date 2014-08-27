/**
 * 
 */
package com.impetus.designpattern.command.impl;

/**
 * Receiver class:
 */
public class Document {
    public void Open() {
        System.out.println("Document Opened");
    }

    public void Save() {
        System.out.println("Document Saved");
    }
}
