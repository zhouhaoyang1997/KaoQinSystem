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






public class DafOffJudge extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		User user = (User) session.getAttribute("user");
		UserService sv = new UserService();
		List<QingJia> qingjia = null;
		try {
			qingjia = sv.getAllNotAgreeDayOff();
			System.out.println(qingjia);
//			for (QingJia q : qingjia) {
//				user = sv.userSearch(q.getUid()+"");
//				q.setUname(user.getUname());
//			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		req.setAttribute("qingjia", qingjia);
		req.getRequestDispatcher("admin/qingjialist.jsp").forward(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}

