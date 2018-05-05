package com.netease;

import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NoodlesServlet extends HttpServlet {
    private Logger logger = Logger.getLogger(NoodlesServlet.class);
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String vegetable = request.getParameter("vegetable");
        logger.info(vegetable);
        PrintWriter writer = response.getWriter();

        if (vegetable == null) {
            vegetable = "Tomato";
        }

        writer.println("<html><body>");
        writer.println("<h1> Noodles with " + vegetable + "</h1>"); 
        writer.println("</body></html>");
    }
}
