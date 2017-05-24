package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.User;
import service.UserService;






public class GetAllUser extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<User> users = null;
		req.getSession().removeAttribute("_users");
		UserService sv = new UserService();
		try {
			users = sv.getAllUser();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		req.setAttribute("_users", users);

		req.getRequestDispatcher("admin/xinxiSearch.jsp").forward(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}

