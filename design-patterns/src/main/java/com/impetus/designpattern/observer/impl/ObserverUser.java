/**
 * 
 */
package com.impetus.designpattern.observer.impl;

import com.impetus.designpattern.observer.interfaces.Observer;
import com.impetus.designpattern.observer.interfaces.Subject;

/**
 * @author kvats
 * @date Aug 21, 2014 @
 */
public class ObserverUser implements Observer {
    private String article;
    private Subject blog;

    public void setSubject(Subject blog) {
        this.blog = blog;
        article = "No New Article!";
    }

    @Override
    public void update() {
        System.out.println("State change reported by Subject.");
        article = (String) blog.getUpdate();
    }

    public String getArticle() {
        return article;
    }

}
