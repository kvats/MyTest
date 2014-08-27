/**
 * 
 */
package com.impetus.designpattern.observer.main;

import com.impetus.designpattern.observer.impl.Blog;
import com.impetus.designpattern.observer.impl.ObserverUser;

/**
 * @author kvats
 * @dAug 21, 2014 @
 */
public class ObserverDesignPattern {
    public static void main(String args[]) {
        Blog blog = new Blog();
        ObserverUser user1 = new ObserverUser();
        ObserverUser user2 = new ObserverUser();
        blog.registerObserver(user1);
        blog.registerObserver(user2);
        user1.setSubject(blog);
        user2.setSubject(blog);

        System.out.println(user1.getArticle());
        blog.postNewArticle();
        System.out.println(user1.getArticle());
    }

}