package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.GongGao;
import service.UserService;






public class GetGongGao extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		GongGao gonggao= null;
		String name = req.getParameter("name");
		UserService sv =new UserService();
		try {
			gonggao = sv.getGongGao(name);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		req.setAttribute("gonggao",gonggao);
		req.getRequestDispatcher("gonggaoinfo.jsp").forward(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}

