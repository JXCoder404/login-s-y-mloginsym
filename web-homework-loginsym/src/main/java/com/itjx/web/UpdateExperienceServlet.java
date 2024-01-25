package com.itjx.web;

import com.alibaba.fastjson.JSON;
import com.itjx.pojo.Experience;
import com.itjx.service.ExperienceService;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateExperienceServlet")
public class UpdateExperienceServlet extends HttpServlet {
    ExperienceService experienceService = new ExperienceService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("utf-8");

        BufferedReader reader = request.getReader();
        String line = reader.readLine();

        Experience experience = JSON.parseObject(line, Experience.class);
        experienceService.update(experience);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.doGet(request, response);
    }
}