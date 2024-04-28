package controller;



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.UserBean;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		List<UserBean> userList=null;
		String name = request.getParameter("userName");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		String cpass = request.getParameter("cpass");
		
		UserBean bean=new UserBean();
		bean.setUserName(name);
		bean.setUserEmail(email);
		bean.setPassword(pass);
		bean.setConPassword(cpass);
		
		if(userList==null) {
			userList=new ArrayList<UserBean>();
		}
		
		userList.add(bean);
		
		request.getServletContext().setAttribute("userList", userList);
		
		request.getServletContext().setAttribute("success","Register Successful!!!");
		
		response.sendRedirect("login.jsp");
		
	}

}
