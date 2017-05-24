package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.UserService;






public class DeleteDepart extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String udepartname = req.getParameter("udepartname");
		UserService sv = new UserService();
		try {
			sv.deleteDepart(udepartname);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		req.getRequestDispatcher("GetAllDepartServlet").forward(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}

