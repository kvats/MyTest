/**
 * 
 */
package com.impetus.designpattern.observer.interfaces;

/**
 * @author kvats
 * 
 */
public interface Observer {

    public void update();

    public void setSubject(Subject subject);
}
