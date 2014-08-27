/**
 * 
 */
package com.impetus.designpattern.observer.interfaces;

/**
 * @author kvats
 * 
 */
public interface Subject {

    public void registerObserver(Observer observer);

    public void notifyObserver();

    public void unRegisterObserver(Observer observer);

    public Object getUpdate();

}
