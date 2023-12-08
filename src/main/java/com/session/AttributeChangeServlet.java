package com.session;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "AttributeChangeServlet", value = "/AttributeChangeServlet")
public class AttributeChangeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/main.jsp");
        requestDispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        System.out.println(session.getAttribute("username"));
        System.out.println(session.getAttribute("password"));

        session.setAttribute("username","usenanme ozgardi");
        session.setAttribute("password","password ozgardi");
        response.sendRedirect("/views/main.jsp");
    }
}
