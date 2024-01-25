package com.itjx.web;

import com.itjx.service.InfService;

import java.io.*;
import java.util.UUID;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@MultipartConfig
@WebServlet("/UpdateImageServlet")
public class UpdateImageServlet extends HttpServlet {
    private InfService infService = new InfService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        //获取formdata数据，获取文件，写入本地磁盘
        Part myFile = request.getPart("myFile");
        String fileName = UUID.randomUUID().toString()+".jpg";
        myFile.write("C:\\Users\\Zjx\\IdeaProjects\\JavaWebPro\\web-homeword-loginsym\\src\\main\\webapp\\image\\"+fileName);

        //更新数据库中的图片地址信息
        HttpSession session = request.getSession();
        Object username = session.getAttribute("username");
        infService.updateImg(username.toString(),"image/"+fileName);



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        this.doGet(request, response);
    }
}