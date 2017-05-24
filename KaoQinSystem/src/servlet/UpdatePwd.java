package servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.User;
import service.UserService;






public class UpdatePwd extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		User user = (User) session.getAttribute("user");
		String uname = req.getParameter("uname");
		String upwd = req.getParameter("upwd");
		user.setUname(uname);
		user.setUpwd(upwd);
		System.out.println(user);
		UserService sv = new UserService();
		try {
			sv.updateuser(user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//更新session
		session.setAttribute("user", user);
		req.setAttribute("msg", "修改成功");
		req.getRequestDispatcher("mimaxiugai.jsp").forward(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}

