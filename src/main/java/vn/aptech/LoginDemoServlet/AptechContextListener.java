/*
 * © Copyright 2021 by AnhNBT™
 */
package vn.aptech.LoginDemoServlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Web application lifecycle listener.
 *
 * @author Nguyen Ba Tuan Anh <anhnbt.it@gmail.com>
 */
@WebListener()
public class AptechContextListener implements ServletContextListener {

    private int count = 0;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        sce.getServletContext().setAttribute("count", this.count);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
