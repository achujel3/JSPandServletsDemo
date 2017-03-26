package com.servletdemo.samples;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class XmlServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        resp.getWriter().println("<h1>This is a response from Xml configured servlet, GET method</h1>");
        resp.getWriter().println("<h1>Hello, " + name + "!</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        resp.getWriter().println("<h1>This is a response from Xml configured servlet, POST method</h1>");
        resp.getWriter().println("<h1>Hello, " + name + "!</h1>");
    }
}
