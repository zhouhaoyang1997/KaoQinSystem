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

import domain.GongGao;
import domain.User;
import service.UserService;






public class GetAllGongGao extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<GongGao> gonggao= null;
		 HttpSession session = req.getSession();
		 String path = "gonggaolist.jsp";
		UserService sv =new UserService();
		try {
			gonggao = sv.getAllGongGao();
			System.out.println(gonggao);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		User user = (User) session.getAttribute("user");
		if("管理员".equals(user.getUrole())){
			path = "admin/gonggaoshanchu.jsp";
		}
		if("普通用户".equals(user.getUrole())){
			path = "gonggaolist.jsp";
		}
		req.setAttribute("gonggao",gonggao);
		req.getRequestDispatcher(path).forward(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}

