package org.example;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;



public class MyController extends HttpServlet {

    private String leagueName;
    private int leagueYear;
    private String leagueSeason;
    private List<String> errors;
    private RequestDispatcher requestDispatcher;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doProcess(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doProcess(req,resp);
    }

    private void doProcess(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
        errors=new ArrayList<String>();
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        leagueName=request.getParameter("lName").toString();
        if (leagueName.length()<=0)
        {
            errors.add("name field ca not be blank. ");
        }
        try {
            leagueYear=Integer.parseInt(request.getParameter("lYear"));
        }
        catch (Exception e)
        {
            errors.add("year field must be numeric.");
        }
        leagueSeason=request.getParameter("lSeason");
        if (leagueSeason.equals("Unknown"))
        {
            errors.add("select a season.");
        }


        if (!errors.isEmpty())
        {

            requestDispatcher = request.getRequestDispatcher("error_page.html");
        }
        else
        {
            requestDispatcher = request.getRequestDispatcher("success_page.html");
        }
        requestDispatcher.forward(request,response);


    }
}
