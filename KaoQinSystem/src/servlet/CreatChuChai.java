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

import domain.ChuChai;

import service.UserService;






public class CreatChuChai extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ChuChai cc =new ChuChai();
		try {
			BeanUtils.populate(cc,req.getParameterMap());
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		System.out.println(cc);
		UserService sv = new UserService();
		try {
			sv.creatChuChai(cc);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		req.setAttribute("msg", "提交成功！");
		req.getRequestDispatcher("shenqingchuchai.jsp").forward(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}

