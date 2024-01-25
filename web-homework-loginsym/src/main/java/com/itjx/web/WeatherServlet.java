package com.itjx.web;

import java.io.*;
import java.net.URL;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/WeatherServlet")
public class WeatherServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        http://t.weather.itboy.net/api/weather/city/101250101
        URL url = new URL("http://t.weather.itboy.net/api/weather/city/101250101");
        InputStreamReader reader = new InputStreamReader(url.openStream(),"UTF-8");
        BufferedReader br = new BufferedReader(reader);
        String line = br.readLine();
        System.out.println(line);
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(line);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.doGet(request, response);
    }
}