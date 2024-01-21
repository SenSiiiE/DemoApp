package com.Servlet;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class AddServlet extends HttpServlet{
		public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
			int i = Integer.parseInt(req.getParameter("num1"));
			int j = Integer.parseInt(req.getParameter("num2"));
			int k = i+j;
			
//			req.setAttribute("k", k);
//			
//			RequestDispatcher rd = req.getRequestDispatcher("sq");
//			rd.forward(req, res);
			
			PrintWriter out = res.getWriter();
			out.println("Result is " + k);
		}
}