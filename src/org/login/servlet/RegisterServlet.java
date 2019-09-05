package org.login.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.login.dao.LoginDao;
import org.login.entity.Login;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public RegisterServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int uid=Integer.parseInt(request.getParameter("uid"));
		String uname=request.getParameter("username");
		String pwd=request.getParameter("upasswd");
		String pwd2=request.getParameter("upasswd2");
		if(!pwd.equals(pwd2)) {
			request.setAttribute("str2", "passwderror");
			request.getRequestDispatcher("register.jsp").forward(request, response);
		}
		else {
			Login login=new Login(uid,uname,pwd);
			LoginDao.RegisterAddUser(login);
			request.setAttribute("str2", "true");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		doGet(request, response);
	}

}
