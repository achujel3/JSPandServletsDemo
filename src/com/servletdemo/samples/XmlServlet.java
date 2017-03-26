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
        resp.setContentType("text/html");

        String userName = req.getParameter("userName");
        String fullName = req.getParameter("fullName");
        String prof = req.getParameter("prof");
        String[] locations = req.getParameterValues("location");

        resp.getWriter().println("<h1>This is a response from Xml configured servlet, POST method.</h1>");
        resp.getWriter().println("<h1>1. Hello, " + userName + "!</h1>");
        resp.getWriter().println("<h1>2. Your full name is " + fullName + ".</h1>");
        resp.getWriter().println("<h1>3. Your profession is " + prof + ".</h1>");
        resp.getWriter().println("<h1>4. Your locations are " + locations.length + ":</h1>");
        for (int i = 0; i < locations.length; i++) {
            resp.getWriter().println("<h1>" + i + ".) " + locations[i] + "</h1>");
        }
    }
}
