package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.ChuChai;
import domain.JiaBan;
import domain.QingJia;
import domain.User;
import service.UserService;






public class AdvancedSearch extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	//获取参数
		String name = req.getParameter("name");
		String endtime = req.getParameter("endtime");
		String starttime = req.getParameter("starttime");
		String uid = req.getParameter("uid");
		String udepartname = req.getParameter("udepartname");
		String uname = req.getParameter("uname");
		String path = req.getParameter("path");
		List object = null;
		UserService sv = new UserService();
	//业务逻辑
		try {
			object = sv.advancedSearch(name,endtime,starttime,uid,udepartname,uname);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		req.setAttribute("list", object);
		//兼容之前的代码
		if(path!=null){
			req.getRequestDispatcher(path+"list.jsp").forward(req, resp);
		}else{
			req.getRequestDispatcher(name.toLowerCase()+"list.jsp").forward(req, resp);
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}

