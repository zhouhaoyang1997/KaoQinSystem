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

import domain.User;
import service.UserService;




public class UpdateServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		User user = new User();
		String role = req.getParameter("role");
		HttpSession session = req.getSession();
		try {
			BeanUtils.populate(user ,req.getParameterMap());
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		UserService sv = new UserService();
		try {
			sv.updateuser(user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if("admin".equals(role)){
			req.setAttribute("user", user);
			req.setAttribute("msg", "更改完成！");
			req.getRequestDispatcher("admin/xinxixiugai.jsp").forward(req, resp);
		}
		else{
			
			//更新session
			session.setAttribute("user", user);
			req.setAttribute("msg", "修改成功");
			req.getRequestDispatcher("xinxixiugai.jsp").forward(req, resp);
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}

