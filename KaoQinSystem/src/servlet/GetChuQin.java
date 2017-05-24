package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import domain.ChuChai;
import domain.QingJia;
import domain.QianDao;
import domain.User;
import domain.ChuQin;
import service.UserService;
import util.DateUtil;






public class GetChuQin extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserService sv = new UserService();
		String date = req.getParameter("month");
		String depart = req.getParameter("depart");
		String methon= req.getParameter("methon");
		List<QianDao> signs = null;
		List<QingJia> qingjias = null;
		List<ChuChai> chuchais= null;
		List<User> users = null;
		ChuQin chuqin = null;
		Map<Integer,ChuQin> list= new HashMap<Integer,ChuQin>();;
		
		try {
			qingjias =sv.getAllDayOff();
			chuchais =sv.getAllChuChai();
			signs = sv.getAllQianDao();
			users = sv.getAllUser();
			for (User user : users) {
					if(depart.equals(user.getUdepartname())){
						chuqin = new ChuQin();
						chuqin.setUname(user.getUname());
						chuqin.setUid(user.getUid());
						for (QianDao sign : signs) {
							if(sign.getUid()==user.getUid()&&sign.getEndtime().getMonth()+1==DateUtil.getMonth(date)){
								chuqin.setShangbanday(chuqin.getShangbanday()+1);
							}
						}
						for (ChuChai chuChai : chuchais) {
							if(chuChai.getUid()==user.getUid()&&chuChai.getStarttime().getMonth()+1==DateUtil.getMonth(date)){
								chuqin.setChuchaiday(chuqin.getChuchaiday()+(chuChai.getEndtime().getTime()-chuChai.getStarttime().getTime())/(24*60*60*1000));
							}
						}
						for (QingJia qingjia : qingjias) {
							if(qingjia.getUid()==user.getUid()&&qingjia.getStarttime().getMonth()+1==DateUtil.getMonth(date)){
								chuqin.setQingjiaday(chuqin.getQingjiaday()+(qingjia.getEndtime().getTime()-qingjia.getStarttime().getDate())/(24*60*60*1000));
							}
						}
						int sum = (int) (chuqin.getChuchaiday()+chuqin.getQingjiaday()+chuqin.getShangbanday());
						chuqin.setSum(sum);
						if(sum>=30){
		            		chuqin.setDescription("全勤");
		            	}else{
		            		chuqin.setDescription("缺勤");
		            	}
						list.put(user.getUid(), chuqin);
					}
				}
					
					System.out.println(list);
					
				} catch (SQLException e) {
					e.printStackTrace();
					}
		req.setAttribute("list", list);
		if("daochu".equals(methon)){
			req.getRequestDispatcher("NewServlet").forward(req, resp);

		}else{
			req.getRequestDispatcher("chuqinlist.jsp").forward(req, resp);
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}

