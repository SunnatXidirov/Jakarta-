package com.Securty;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class Filter implements jakarta.servlet.Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        var req = (HttpServletRequest) (request);
        var resp = (HttpServletResponse) (response);
        HttpSession session = req.getSession();
        String username = (String) session.getAttribute("username");
        if (!req.getRequestURI().equals("/login") && username == null){
            resp.sendRedirect("/login");
        }else {
            filterChain.doFilter(req,resp);
        }
    }
}
