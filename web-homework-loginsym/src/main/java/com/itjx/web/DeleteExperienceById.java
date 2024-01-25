package com.itjx.web;

import com.itjx.service.ExperienceService;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteExperienceById")
public class DeleteExperienceById extends HttpServlet {
    private ExperienceService experienceService = new ExperienceService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String id = request.getParameter("id");
        experienceService.delete(Integer.parseInt(id));

        request.getRequestDispatcher("/information.html").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        this.doGet(request, response);
    }
}