package com.itjx.web;

import com.itjx.pojo.User;
import com.itjx.service.UserService;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private UserService userService= new UserService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        System.out.println(username+password);

        User user = userService.login(username, password);
        if(user!=null){
            //登陆成功
            response.getWriter().write("success");
            HttpSession session = request.getSession();
            session.setAttribute("username",username);


        }
        else{
            //登陆失败

        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.doGet(request, response);
    }
}