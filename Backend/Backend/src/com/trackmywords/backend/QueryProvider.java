package com.trackmywords.backend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/QueryProvider")
public class QueryProvider extends HttpServlet {
       
	//We only want to perform a query done through a post request
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		response.setContentType("text/html");
		request.setAttribute("title", "Bad Request");
		request.setAttribute("message", "A post request is required for query services.");
		request.getRequestDispatcher("/pages/invalid/simple.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//send query to database, get results, return them to user
	}

}