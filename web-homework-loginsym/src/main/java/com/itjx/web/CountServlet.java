package com.itjx.web;

import java.io.*;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CountServlet")
public class CountServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ServletContext servletContext = getServletContext();
        Integer count = (Integer) servletContext.getAttribute("count");
        if(count ==null){
            count=1;
        }
        else{
            count+=1;
        }

        response.getWriter().write(count.toString());
        servletContext.setAttribute("count",count);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.doGet(request, response);
    }
}