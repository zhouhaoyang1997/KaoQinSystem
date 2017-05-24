package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.UserService;






public class XiaoJia extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uid = req.getParameter("uid");
		String starttime = req.getParameter("starttime");
		UserService sv = new UserService();
		try {
			sv.xiaojia(uid,starttime);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		req.getRequestDispatcher("GetAllDayOffServlet").forward(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}

