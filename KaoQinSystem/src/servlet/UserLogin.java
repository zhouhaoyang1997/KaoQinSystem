package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;

import Exception.UserException;
import domain.Department;
import domain.QianDao;
import domain.User;
import service.UserService;

public class UserLogin extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		// 获取表单
		String uname = request.getParameter("uname");
		String upwd = request.getParameter("upwd");
		String role = request.getParameter("urole");
		HttpSession session = request.getSession();
		User user = null;
		String path = null;
		System.out.println(uname);
		// 业务逻辑
		UserService sv = new UserService();
		try {
			// 用户登录
			user = sv.login(uname, upwd);
			if (user != null) {
				path = "/home.jsp";
				
				// 判断是否选择管理员登陆
				if ("管理员".equals(role)) {
					System.out.println(user.getUrole().equals("管理员"));
					// 获取用户权限做判断
					if (user.getUrole().equals("管理员")) {
						path = "/admin/home.jsp";
					} else {
						request.setAttribute("user_msg", "您没有该权限！");
						request.getRequestDispatcher("/index.jsp").forward(request, response);
					}
				}
				
				
//				//将签到的状态加入session
//				QianDao sign = sv.getQiandao(Integer.toString(user.getUid()) );
//				if(sign==null){
//					sign = new QianDao();
//				}
				System.out.println(path);
				//将部门信息放进session  从session读取信息比再用Servlet速度快
				Department dt =  sv.getDepartment(user.getUdepartid());
				session.setAttribute("dt", dt);
				session.setAttribute("user", user);
//				session.setAttribute("sign", sign);
				request.getRequestDispatcher(path).forward(request, response);
			}
		} catch (UserException e) {
			e.printStackTrace();
			request.setAttribute("user_msg", e.getMessage());
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
