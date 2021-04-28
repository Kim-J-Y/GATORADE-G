package org.kosta.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontControllerSerlvet
 */
@WebServlet("/FrontControllerSerlvet")
public class FrontControllerSerlvet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public FrontControllerSerlvet() {
        super();
    }
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
    	try {
    		String uri=request.getRequestURI();
    		String contextPath = request.getContextPath();
    		String command = uri.substring(contextPath.length()+1,uri.length()-".do".length());
    		Controller controller=HandlerMapping.getInstance().create(command);
    		String view = controller.execute(request, response);
    		if(view.startsWith("redirect:")) {
    			response.sendRedirect(view.substring("redirect:".length()));
    		} else {
    			request.getRequestDispatcher(view).forward(request, response);
    		}
    	} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("error.jsp");
		}
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		handleRequest(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		handleRequest(request, response);
	}

}
