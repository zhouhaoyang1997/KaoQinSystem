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
import domain.User;
import service.UserService;






public class GetAllChuChaiServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserService sv = new UserService();
		List<ChuChai> cc = null;
		try {
			cc = sv.getAllChuChai();
			System.out.println("cc"+cc);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		req.setAttribute("list",cc);
		req.getRequestDispatcher("chuchailist.jsp").forward(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}

