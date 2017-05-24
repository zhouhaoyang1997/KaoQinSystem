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






public class UserAdvancedSearch extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uid = req.getParameter("uid");
		String udepartname = req.getParameter("udepartname");
		String uname = req.getParameter("uname");

		String methon = req.getParameter("methon");
		String path = null;
		List<User> user = null;
		UserService sv = new UserService();
		try {
			user = sv.userAdvancedSearch(uid,uname,udepartname);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(user==null){
			path="admin/xinxiSearch.jsp";
			req.setAttribute("msg", "对不起。没有结果。请检查是否输入有误！");
		}
		if("search".equals(methon)){
			 path = "admin/xinxiSearch.jsp";
			 req.getSession().setAttribute("_users", user);
		}
		if("change".equals(methon)){
			 path = "admin/xinxixiugai.jsp";
			 req.setAttribute("_user", user.get(0));
		}
		req.getRequestDispatcher(path).forward(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}

