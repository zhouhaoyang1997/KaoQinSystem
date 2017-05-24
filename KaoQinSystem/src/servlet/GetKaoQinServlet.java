package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.KaoQin;
import service.UserService;






public class GetKaoQinServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		KaoQin kaoqin= null;
		 String path = "kaoqinzhidu.jsp";
		UserService sv =new UserService();
		try {
			kaoqin = sv.getKaoQin();
			System.out.println(kaoqin);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		req.setAttribute("kaoqin",kaoqin);
		req.getRequestDispatcher(path).forward(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}

