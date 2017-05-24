package service;

import java.sql.SQLException;
import java.util.List;

import Exception.UserException;
import dao.UserDao;
import domain.ChuChai;
import domain.Department;
import domain.QingJia;
import domain.QianDao;
import domain.User;
import servlet.SignIn;
import util.DateUtil;
import domain.GongGao;
import domain.KaoQin;

public class UserService {
		UserDao dao = new UserDao();
		//登陆
		public User login(String uname, String upwd) throws UserException {
			User user=null;
			try {
				user = dao.login(uname,upwd);
				if(user==null){
					throw new UserException("用户名或密码错误!");
				}
			} catch (SQLException e) {
				e.printStackTrace();
				throw new UserException("用户名或密码错误!");
			}
			return user;
		}
		//更新信息
		public void updateuser(User user) throws SQLException {
			dao.updatauser(user);
		}
		public void qiandao(String uid, String addr) throws SQLException {
		//	java.sql.Timestamp date = DateUtil.getDateTime();
	//		int hour = date.getHours();
	//		if(hour>10&&dao.judgeQiaodao(uid)==null){
	//			dao.setQueQin(uid);
	//		}else{
				dao.qiandao(uid, addr);
	//		}
		}
		public void qiantui(String uid) throws SQLException {
			dao.qiantui(uid);
		}
		public QianDao getQiandao(String uid) throws SQLException {
			return dao.getQiandao(uid);
		}
		public List<QianDao> getSigns(int uid) throws SQLException {
			return dao.getSigns(uid);
		}
		public void qingjia(QingJia dayoff) throws SQLException {
			dao.qingjia(dayoff);
		}
		public List<QingJia> getDayOff(int uid) throws SQLException {
			return dao.getDayOff(uid);
		}
		public Department getDepartment(String udepartid) throws SQLException {
			return dao.getDepartment(udepartid);
		}
		public List<GongGao> getAllGongGao() throws SQLException {
			return dao.getAllGongGao();
		}
		public  List<ChuChai> getChuChai(int uid) throws SQLException {
			return dao.getChuChai(uid);
		}
		public void creatChuChai(ChuChai cc) throws SQLException {
			dao.creatChuChai(cc);
		}
		public void creatGongGao(GongGao gg) throws SQLException {
			dao.creatGongGao(gg);
		}
		public int deleteGongGao(String name) throws SQLException {
			return dao.deleteGongGao(name);
		}
		public List<User> userAdvancedSearch(String uid, String uname, String udepartname) throws SQLException {
			return dao.userAdvancedsearch(uid,uname,udepartname);
		}
		public List<ChuChai> getAllChuChai() throws SQLException {
			return dao.getAllChuChai();
		}
		public List<QingJia> getAllDayOff() throws SQLException {
			return dao.getAllDayOff();
		}
		public List<QianDao> getQianDao(int uid) throws SQLException {
			return dao.getQianDao(uid);
		}
		public List<QianDao> getAllQianDao() throws SQLException {
			return dao.getAllQianDao();
		}
		public List<User> getAllUser() throws SQLException {
			return dao.getAllUser();
		}
		public void agreeDayOff(String uid, String starttime) throws SQLException {
			dao.agreeDayOff(uid,starttime);
		}
		public List<Department> getAllDepart() throws SQLException {
			return dao.getAllDepart() ;
		}
		public Department departSearch(String udepartname) throws SQLException {
			return dao.departSearch(udepartname);
		}
		public void updatedepart(Department depart) throws SQLException {
			dao.updatedepart(depart);		
		}
		public void changeRole(String uid, String urole) throws SQLException {
			dao.changeRole(uid,urole);
		}
		public void creatKaoQin(KaoQin kq) throws SQLException {
			dao.creatKaoQin(kq);
		}
		public KaoQin getKaoQin() throws SQLException {
			return dao.getKaoQin();
		}
		public void xiaojia(String uid, String starttime) throws SQLException {
			dao.xiaojia( uid,  starttime);
		}
		public GongGao getGongGao(String name) throws SQLException {
			return dao.getGongGao(name);
		}
		public User userSearch(String uid) throws SQLException {
			return dao.userSearch(uid);
		}
		public void deleteUser(String uid) throws SQLException {
			 dao.deleteUser(uid);
		}
		public void addUser(User user) throws SQLException {
			dao.addUser(user);
		}
		public void deleteDepart(String udepartname) throws SQLException {
			dao.deleteDepart(udepartname);
		}
		
		public List advancedSearch(String name, String endtime, String starttime, String uid, String udepartname,
				String uname) throws SQLException, ClassNotFoundException {
			return dao.advancedSearch( name,  endtime,  starttime,  uid,  udepartname,
					 uname);
		}
		public List<QingJia> getAllNotAgreeDayOff() throws SQLException {
			return dao.getAllNotAgreeDayOff();
		}
		public void createDepart(Department dp) throws SQLException {
			dao.createDepart(dp);
		}
}
