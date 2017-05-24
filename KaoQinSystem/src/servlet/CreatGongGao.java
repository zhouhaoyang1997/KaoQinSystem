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

import domain.GongGao;
import domain.QingJia;
import domain.QianDao;
import domain.User;
import service.UserService;






public class CreatGongGao extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		GongGao gg = new GongGao();
		try {
			BeanUtils.populate(gg,req.getParameterMap());
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		System.out.println(gg);
		UserService sv = new UserService();
		try {
			sv.creatGongGao(gg);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		req.setAttribute("msg", "提交成功！");
		req.getRequestDispatcher("GetAllGongGao").forward(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}

