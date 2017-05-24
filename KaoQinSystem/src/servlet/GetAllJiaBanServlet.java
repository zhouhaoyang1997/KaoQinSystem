package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.QianDao;
import domain.User;
import service.UserService;






public class GetAllJiaBanServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		User user = (User) session.getAttribute("user");
		UserService sv = new UserService();
		List<QianDao> jiaban = null;
		try {
			jiaban = sv.getAllQianDao();
			System.out.println(jiaban);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		req.setAttribute("list", jiaban);
		req.getRequestDispatcher("jiabanlist.jsp").forward(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}

