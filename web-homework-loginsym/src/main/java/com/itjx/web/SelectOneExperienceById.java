package com.itjx.web;

import com.alibaba.fastjson.JSON;
import com.itjx.pojo.Experience;
import com.itjx.service.ExperienceService;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SelectOneExperienceById")
public class SelectOneExperienceById extends HttpServlet {
    ExperienceService experienceService = new ExperienceService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String id = request.getParameter("id");
        Experience experience = experienceService.selectOneById(Integer.parseInt(id));

        System.out.println(experience);

        String jsonString = JSON.toJSONString(experience);
        System.out.println(jsonString);
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(jsonString);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.doGet(request, response);
    }
}