package com.servletdemo.login.form;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username, password;

        username = request.getParameter("username");
        password = request.getParameter("password");

        LoginService loginService = new LoginService();
        boolean allowRedirect = loginService.authenticate(username, password);

        if (allowRedirect) {
            request.getSession().setAttribute("username", username);
            RequestDispatcher requestDispatcher
                    = request.getRequestDispatcher("loginForm/Success.jsp");
            requestDispatcher.forward(request, response);
            return;
        } else {
            response.sendRedirect("loginForm/Login.jsp");
            return;
        }
    }

}
