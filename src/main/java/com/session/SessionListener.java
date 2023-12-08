package com.session;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {
//        HttpSession session = se.getSession();
//        String id = session.getId();
//        System.out.println("session created with id: "+id);
//        session.setMaxInactiveInterval(2);

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
//        HttpSession session = se.getSession();
//        String id = session.getId();
//        System.out.println("session destroyed with id: "+id);

    }
}
