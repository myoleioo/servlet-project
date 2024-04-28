

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletWorkout
 */
@WebServlet("/ServletWorkout")
public class ServletWorkout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletWorkout() {
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
		 response.setContentType("text/html");
		    String[] subject=request.getParameterValues("subject");
		      if(subject!=null) {
		        request.getRequestDispatcher("workoutAns.html").include(request, response);
		        int count = 1;
		        for(String sub : subject) {
		          out.println( "<br>"+count +". "+ sub);
		          count++;
		        }
		      }else {
		        request.getRequestDispatcher("workoutError.html").forward(request,response);
		      }
	}

}
