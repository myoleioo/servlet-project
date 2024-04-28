package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.UserBean2;
import java.util.ArrayList;

/**
 * Servlet implementation class DataEntryServlet
 */
@WebServlet("/DataEntry")
public class DataEntryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DataEntryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String name= request.getParameter("userName");
		String dob = request.getParameter("dob");
		String gender = request.getParameter("gender");
		
		String[] p = request.getParameterValues("pl");
		ArrayList pl = new ArrayList();
		for(String s:p) {
			pl.add(s);
		}
		
		/* pl.add("pl"); */
		
		String course = request.getParameter("course");
		
		UserBean2 user = new UserBean2();
		
		user.setName(name);
		user.setDob(dob);
		user.setGender(gender);
		user.setPl(pl);
		user.setCourse(course);
		
		request.getServletContext().setAttribute("user", user);
		response.sendRedirect("Output.jsp");
	}

}
