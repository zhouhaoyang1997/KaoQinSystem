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

import org.apache.commons.beanutils.BeanUtils;

import domain.KaoQin;
import domain.QingJia;
import domain.QianDao;
import domain.User;
import service.UserService;






public class CreatKaoQinRule extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		KaoQin kq = new KaoQin();
		try {
			BeanUtils.populate(kq,req.getParameterMap());
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		System.out.println(kq);
		UserService sv = new UserService();
		try {
			sv.creatKaoQin(kq);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		req.setAttribute("msg", "提交成功！");
		req.getRequestDispatcher("admin/kaoqinfabu.jsp").forward(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}

