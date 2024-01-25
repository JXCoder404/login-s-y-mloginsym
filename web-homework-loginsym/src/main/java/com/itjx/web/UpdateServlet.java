package com.itjx.web;

import com.alibaba.fastjson.JSON;
import com.itjx.pojo.Inf;
import com.itjx.service.InfService;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
    private InfService infService = new InfService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("utf-8");
        BufferedReader reader = request.getReader();
        String line = reader.readLine();
        System.out.println("修改后的内容是："+line);

        HttpSession session = request.getSession();
        Object username = session.getAttribute("username");



        Inf inf = JSON.parseObject(line, Inf.class);
        inf.setUsername(username.toString());
        boolean flag = infService.updateAll(inf);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.doGet(request, response);
    }
}