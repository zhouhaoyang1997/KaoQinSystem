package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Department;
import domain.User;
import service.UserService;






public class DepartSearch extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String udepartname = req.getParameter("udepartname");
		String methon = req.getParameter("methon");
		String path = null;
		Department depart = null;
		UserService sv = new UserService();
		try {
			depart = sv.departSearch(udepartname);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if("Info".equals(methon)){
			path = "admin/bumenxinxi.jsp";
		}else{
			path = "bumenxiugai.jsp";
		}
		req.setAttribute("depart", depart);
		req.getRequestDispatcher(path).forward(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}

