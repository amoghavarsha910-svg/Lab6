package FactorialServlet.java;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/factorial")
public class FactorialServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int num = Integer.parseInt(request.getParameter("num"));

        long fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        out.println("<h2>Factorial Result</h2>");
        out.println("Number: " + num + "<br>");
        out.println("Factorial: " + fact);
    }
}