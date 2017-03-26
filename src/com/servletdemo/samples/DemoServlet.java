package com.servletdemo.samples;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DemoServlet", urlPatterns = {"/a/b/c", "/servlets/hey"})
public class DemoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("GET method initialized");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        HttpSession session = request.getSession();
        ServletContext servletContext = request.getServletContext();
        if(name != "" && name != null){
            session.setAttribute("sessionName", name);
            servletContext.setAttribute("sessionName", name);
        }
        out.println("<h1>this is doGet changed method and DemoServlet</h1>");
        out.println("<h1>name: " + name + "</h1>");
        out.println("<h1>sessionName: " + (String) session.getAttribute("sessionName") + "</h1>");
        out.println("<h1>contextName: " + (String) servletContext.getAttribute("sessionName") + "</h1>");
        out.flush();
    }

}
