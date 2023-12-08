package com.jakarta_ee_initparam;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "initparaWithOutXMLServlet",
        value = "/initparamWithOutXMLServlet",
        initParams = {@WebInitParam
                (
                        name = "username",
                        value = "postgres"
                ), @WebInitParam
                (
                        name = "password",
                        value = "0303"
                )}


)
public class initparaWithOutXMLServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletConfig servletConfig = getServletConfig();
        String username = servletConfig.getInitParameter("username");
        String password = servletConfig.getInitParameter("password");
        PrintWriter rw = response.getWriter();
        rw.println("<h1> username (without XML) :" + username + " </h1>");
        rw.println("<h1> username (without XML) :" + password + " </h1>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
