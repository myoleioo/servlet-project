package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.LoginBean;
import model.UserBean;
import java.util.List;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		// TODO Auto-generated method stub
		//doGet(request, response);
		String email=request.getParameter("email");
		String pass=request.getParameter("pass");
		
		LoginBean bean=new LoginBean();
		bean.setUserEmail(email);
		bean.setPassword(pass);
		
		List<UserBean> userList=(List<UserBean>)request.getServletContext().getAttribute("userList");
		
		for(UserBean u :userList) {
		//if(user != null) {
			if(bean.getUserEmail().equals(u.getUserEmail()) && bean.getPassword().equals(u.getPassword())) {
				
				request.getSession().setAttribute("email", bean.getUserEmail());
				response.sendRedirect("welcome.jsp");
				break;
			}
			//else {
				//request.getServletContext().setAttribute("loginerror", "login fail");
				//response.sendRedirect("login.jsp");
			//}
		//}else {
			//request.setAttribute("error", "No User Found!!");
			//response.sendRedirect("register.jsp");
			//request.getRequestDispatcher("register.jsp").forward(request, response);
		}
		
	}

}
