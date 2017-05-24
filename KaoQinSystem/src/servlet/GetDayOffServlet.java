package servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.QingJia;
import domain.QianDao;
import domain.User;
import service.UserService;






public class GetDayOffServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		User user = (User) session.getAttribute("user");
		UserService sv = new UserService();
		List<QingJia> DayOffs = null;
		try {
			DayOffs = sv.getDayOff(user.getUid());
			for (QingJia qingJia : DayOffs) {
				qingJia.setUname(user.getUname());
			}
			System.out.println(DayOffs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		req.setAttribute("list",DayOffs);
		req.getRequestDispatcher("qingjialist.jsp").forward(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}

