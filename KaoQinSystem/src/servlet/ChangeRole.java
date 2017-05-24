package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.UserService;






public class ChangeRole extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String[] uids = req.getParameterValues("uid");
		String urole = req.getParameter("urole");
		
		UserService sv = new UserService();
		try {
			for (String uid : uids) {
				sv.changeRole(uid,urole);
			}
			req.setAttribute("msg", "操作成功！");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		req.getRequestDispatcher("userlist.jsp").forward(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}

