package com.itjx.web;

import com.alibaba.fastjson.JSON;
import com.itjx.pojo.Inf;
import com.itjx.service.InfService;
import com.itjx.util.SqlSessionFactoryUtils;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/InformationServlet")
public class InformationServlet extends HttpServlet {
    private InfService infService = new InfService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        Object username = session.getAttribute("username");
        System.out.println("获取的用户名："+username);

        response.setContentType("application/json;charset=utf-8");

        Inf inf = infService.selectAll(String.valueOf(username));
        if(inf!=null){
            System.out.println(inf);
            String jsonString = JSON.toJSONString(inf);
            System.out.println(jsonString);
            response.getWriter().write(jsonString);
        }
        else{
            infService.createNewUser(username.toString());
            System.out.println(inf);
            String jsonString = JSON.toJSONString(inf);
            System.out.println(jsonString);
            response.getWriter().write(jsonString);
        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.doGet(request, response);
    }
}