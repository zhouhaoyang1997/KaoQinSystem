package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.QingJia;
import domain.User;
import service.UserService;






public class AgreeDayOff extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uid = req.getParameter("uid");
		String starttime = req.getParameter("starttime");
		UserService sv = new UserService();
		try {
			sv.agreeDayOff(uid,starttime);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		req.getRequestDispatcher("DafOffJudge").forward(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}

