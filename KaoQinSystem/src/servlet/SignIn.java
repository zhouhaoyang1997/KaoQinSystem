package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.sql.Date;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.User;
import domain.QianDao;
import service.UserService;






public class SignIn extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//获取参数
		String uid = req.getParameter("uid");
		String addr = req.getParameter("addr");
		String method = req.getParameter("qiandao");
		System.out.println(method);
		//业务逻辑
		UserService sv = new UserService();
		if(method.equals("签到")){
			try {
				sv.qiandao(uid,addr);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(method.equals("签退")){
			try {
				sv.qiantui(uid);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		req.getRequestDispatcher("/close.jsp").forward(req, resp);	
		}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}

