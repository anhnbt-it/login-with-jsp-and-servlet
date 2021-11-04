/*
 * © Copyright 2021 by AnhNBT™
 */
package vn.aptech.LoginDemoServlet;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Web application lifecycle listener.
 *
 * @author Nguyen Ba Tuan Anh <anhnbt.it@gmail.com>
 */
@WebListener()
public class AptechSessionListener implements HttpSessionListener, HttpSessionAttributeListener {

    @Override
    public void sessionCreated(HttpSessionEvent hse) {
        System.out.println("Session created");
        int count = (int) hse.getSession().getServletContext().getAttribute("count");
        count = count + 1;
        hse.getSession().getServletContext().setAttribute("count", count);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent hse) {
        System.out.println("Session Destroyed");
        int count = (int) hse.getSession().getServletContext().getAttribute("count");
        count = count - 1;
        hse.getSession().getServletContext().setAttribute("count", count);
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent hsbe) {
        System.out.println("Attribute added: " + hsbe.getName());
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent hsbe) {
        System.out.println("Attribute removed: " + hsbe.getName());
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent hsbe) {
        System.out.println("Attribute replaced: " + hsbe.getName());
    }
}
