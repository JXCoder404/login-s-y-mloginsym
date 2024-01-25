package com.itjx.web;

import com.alibaba.fastjson.JSON;
import com.itjx.pojo.Experience;
import com.itjx.service.ExperienceService;

import java.io.*;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ExperienceServlet")
public class ExperienceServlet extends HttpServlet {
    private ExperienceService experienceService = new ExperienceService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        Object username = session.getAttribute("username");

        request.setCharacterEncoding("utf-8");

        response.setContentType("application/json;charset=utf-8");

        List<Experience> experiences = experienceService.selectAllByUsername(username.toString());

        System.out.println(experiences);

        String jsonString = JSON.toJSONString(experiences);
        System.out.println("实习经历"+jsonString);
        response.getWriter().write(jsonString);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.doGet(request, response);
    }
}