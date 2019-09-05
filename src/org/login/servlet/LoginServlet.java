package org.login.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.login.dao.LoginDao;
import org.login.entity.Login;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public LoginServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("upwd");
		Login login=new Login();
		login=LoginDao.LoginQuery(uname, pwd);
		request.setAttribute("login", login);
		if(login!=null) {
			request.setAttribute("str", "true");
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		}else{
			request.setAttribute("str", "false");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
