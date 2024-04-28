
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TextServlet
 */
@WebServlet("/TextServlet")
public class TextServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TextServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.print("doGet method");
		
		String name = request.getParameter("username");
		out.print("<br>Name :" + name);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.print("doPost method");

		String name = request.getParameter("username");
		out.print("<br>Name :" + name);
		
		String date = request.getParameter("date");
		out.print("<br>DOB :" + date);
		
		String gender= request.getParameter("gender");
		out.print("<br>Genden :" + gender);
		
		String [] subject=request.getParameterValues("course");
		int count=1;
		for(String s:subject) {
		out.println("<br>subject"+count+":"+s);
		count++;
		}
		

	}

}
