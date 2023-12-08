package com.session;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpSessionAttributeListener;
import jakarta.servlet.http.HttpSessionBindingEvent;

@WebListener
public class AttributeListener implements HttpSessionAttributeListener {
    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        String name = event.getName();
        Object value = event.getValue();
        HttpSession session = event.getSession();
        System.out.println("session id: "+session.getId());
        System.out.println("qo'shilgan attribute name: "+name);
        System.out.println("qo'shilgan attribute value: "+value);
        System.out.println("session yashash vaqti "+session.getMaxInactiveInterval());

    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        String name = event.getName();
        Object value = event.getValue();
        HttpSession session = event.getSession();
        System.out.println("session id: "+session.getId());
        System.out.println("o'lgan sessiondagi attribute name: "+name);
        System.out.println("o'lgan sessiondagi attribute value: "+value);
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        String name = event.getName();
        Object value = event.getValue();
        HttpSession session = event.getSession();
        System.out.println("session id: "+session.getId());
        System.out.println("sessionda o'gargan attribute name: "+name);
        System.out.println("sessionda o'gargan attribute value: "+value);
    }
}
