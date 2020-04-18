package com.lylechristine;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


//To run within Intellij: run the Tomcat server from the configurations panel;
// then open browser at either http://localhost:9090/test or http://localhost:9090/lyle-servlet

@WebServlet(name = "TestServlet", urlPatterns = {"/test", "/lyle-servlet"})
public class TestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<b>Howdy World - I am a Java Servlet!</b>");
        out.println("</html>");

    }
}