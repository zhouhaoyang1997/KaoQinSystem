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

import domain.ChuChai;
import domain.Department;
import domain.User;
import service.UserService;






public class GetAllDepartServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserService sv = new UserService();
		User user = new User();
		List<Department> depart = null;
		try {
			depart = sv.getAllDepart();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		req.setAttribute("depart",depart);
		req.getRequestDispatcher("admin/bumenlist.jsp").forward(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}

