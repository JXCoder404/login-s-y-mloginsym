package com.itjx.web;

import com.alibaba.fastjson.JSON;
import com.itjx.pojo.User;
import com.itjx.service.UserService;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    private UserService userService = new UserService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        BufferedReader reader = request.getReader();
        String line = reader.readLine();
        System.out.println(line);

        User user = JSON.parseObject(line, User.class);
        Boolean registered = userService.register(user);
        if(registered){
            response.getWriter().write("success");
        }
        else{
            response.getWriter().write("failed");
        }



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.doGet(request, response);
    }
}