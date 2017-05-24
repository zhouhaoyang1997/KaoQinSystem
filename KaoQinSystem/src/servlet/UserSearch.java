package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.User;
import service.UserService;






public class UserSearch extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uid = req.getParameter("uid");

		String methon = req.getParameter("methon");
		String path = null;
		User user = null;
		UserService sv = new UserService();
		try {
			user = sv.userSearch(uid);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(user==null){
			path="admin/xinxiSearch.jsp";
			req.setAttribute("msg", "对不起。没有结果。请检查是否输入有误！");
		}
		if("search".equals(methon)){
			 path = "admin/userlist.jsp";
			 req.setAttribute("_user", user);
		}
		if("change".equals(methon)){
			 path = "admin/xinxixiugai.jsp";
			 req.setAttribute("_user", user);
		}
		if("Info".equals(methon)){
			 path = "admin/myAccount.jsp";
			 req.setAttribute("_user", user);
		}
		req.getRequestDispatcher(path).forward(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}

