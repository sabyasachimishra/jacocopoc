package com.math.pkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MathTest
 */
public class MathTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MathTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstVal = request.getParameter("first");
		String LastVal = request.getParameter("second");
		PrintWriter out = response.getWriter();
		
		int a = Integer.parseInt(firstVal);
		int b = Integer.parseInt(LastVal);
		
		
		out.print("Hello World");
		out.print("\n");
		out.print(firstVal);
		out.print("\n");
		out.print(LastVal);
		out.print("\n");
		out.print(add(a,b));
		out.print("\n");
		out.print(sub(a,b));
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public Integer add(Integer a, Integer b)
	{
		return a+b;
	}
	
	public Integer sub(Integer a, Integer b)
	{
		if (a>b) {
			return a-b;
		}
		else {
			return b-a;
		}
	}

}
