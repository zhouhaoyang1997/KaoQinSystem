package servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;

import domain.Department;
import domain.User;
import service.UserService;




public class UpdateDepartServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Department depart = new Department();
		HttpSession session = req.getSession();
		try {
			BeanUtils.populate(depart ,req.getParameterMap());
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		UserService sv = new UserService();
		try {
			sv.updatedepart(depart);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//更新session
		req.setAttribute("msg", "修改成功");
		req.getRequestDispatcher("bumenxiugai.jsp").forward(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}

