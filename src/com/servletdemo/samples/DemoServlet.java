package com.servletdemo.samples;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DemoServlet", urlPatterns = {"/a/b/c", "/servlets/hey"})
public class DemoServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("GET method initialized");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>hey</h1>");
        out.flush();
    }

}
