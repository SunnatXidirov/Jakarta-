package com.context_event;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import lombok.extern.java.Log;

@WebListener
@Log
public class StartUpShutdownListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info(":::::::::::::::::: APPLICATION STARTED :::::::::::::::::::::::");

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.info(":::::::::::::::::: APPLICATION SHUTDOWN :::::::::::::::::::::::");


    }
}
