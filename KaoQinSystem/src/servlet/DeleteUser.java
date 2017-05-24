package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.User;
import service.UserService;






public class DeleteUser extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uid = req.getParameter("uid");
//		User user = null;
//		HttpSession session = req.getSession();
		UserService sv = new UserService();
		try {
	//		user = sv.userSearch(uid);
			 sv.deleteUser(uid);
		} catch (SQLException e) {
			e.printStackTrace();
		}
//		List<User> users = (List<User>) session.getAttribute("_users");
		
//		Iterator<User> i = users.iterator();
//		while(i.hasNext()){
//			if(user.equals(i.next())){
//				i.remove();
//			}
//		}
//		session.removeAttribute("_users");
//		session.setAttribute("_users", users);

		req.getRequestDispatcher("GetAllUser").forward(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}

