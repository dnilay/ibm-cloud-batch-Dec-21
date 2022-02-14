package org.example;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Controller", value = "/controller.do")
public class Controller extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

       processRequest(request,response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        processRequest(request,response);
    }
    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out=response.getWriter();
        out.println("<h1>within controller.do servlet");
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append(request.getParameter("t1")+request.getParameter("t2")+request.getParameter("r1"));
        out.println(stringBuffer.toString());
    }

}
