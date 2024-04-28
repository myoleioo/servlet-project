

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SessionLoginServlet
 */
@WebServlet("/loginServlet")
public class SessionLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionLoginServlet() {
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
		PrintWriter out=response.getWriter(); 
		request.getRequestDispatcher("sessionlink.html").include(request, response); 
		String name=request.getParameter("name"); 
		String password=request.getParameter("password");
		if(password.equals("admin123")){ 
		out.print("<br>You are successfully logged in!"); 
		out.print("<br>Welcome, "+name); 
		request.getSession().setAttribute("name",name); 
		}else{ 
		out.print("sorry, username or password error!"); 
		request.getRequestDispatcher("sessionlogin.html").include(request, response); 
		} 
		out.close();
	
	}

}
