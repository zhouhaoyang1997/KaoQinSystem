package dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;


import domain.ChuChai;
import domain.Department;
import domain.QingJia;
import domain.QianDao;
import domain.User;
import domain.GongGao;
import domain.KaoQin;
import util.C3P0Util;
import util.DateUtil;

public class UserDao {

	// 登陆
	public User login(String uname, String upwd) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDs());
		return qr.query("select * from user where uname = ? && upwd = ?", new BeanHandler<User>(User.class), uname,
				upwd);
	}

	// 查
	public List<User> userAdvancedsearch(String uid, String uname, String udepartname) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDs());
		String sql = "select * from user where 1 = 1";
	
		List list = new ArrayList();
		if(!"".equals(uid)){
			sql+=" and uid = ?"; //  不能在这写%   %'1002'%
			list.add(uid);// '%1002%'
		}
		
		if(!"".equals(uname)){
			sql+=" and uname=?";
			list.add(uname);
		}
		
		
		if(!"".equals(udepartname)){
			sql+=" and udepartname = ?";
			list.add(udepartname);
		}
		System.out.println(sql + "   " +list.toArray());
		return qr.query(sql, new BeanListHandler<User>(User.class),list.toArray());
		
	}
	//get all user
	public List<User> getAllUser() throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDs());
		return qr.query("SELECT * FROM user ", new BeanListHandler<User>(User.class));
		}
	// 改
	public void updatauser(User user) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDs());
		qr.update(
				"update user set uname=?,usex=?,udepartid=?,udepartname=?,utel=?,uaddr=?,umail=?,uboss=?,uentrytime=?,ubirth=? ,uwork = ? where uid=?",
				user.getUname(), user.getUsex(), user.getUdepartid(), user.getUdepartname(),
				user.getUtel(), user.getUaddr(), user.getUmail(), user.getUboss(), user.getUentrytime(),
				user.getUbirth(), user.getUwork(),user.getUid());
	}

	// 签到  state 似乎没意义了
	public void qiandao(String uid, String addr) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDs());
		String description = "正常";
		java.sql.Timestamp date = DateUtil.getDateTime();
		int hour = date.getHours();
	//	if((hour<=10&&hour>0)){
			qr.update("insert into qiandao(uid,starttime,addr,state,description) values(?,?,?,?,?)",uid , DateUtil.getDateTime(), addr,
					1,description);
//		}
	//	else if((hour<=15&&hour>12)){
		qr.update("UPDATE qiandao SET starttime1 = NOW(),state=2 WHERE uid = ? AND TO_DAYS(starttime)= TO_DAYS(NOW());",uid);
	//	}
	//	else if((hour>19&&hour<=0)){
			description = "加班";
		qr.update("UPDATE qiandao SET starttime2 = ?,description= '加班' WHERE uid = ? AND TO_DAYS(starttime)= TO_DAYS(NOW());",DateUtil.getDateTime(),uid);
	//	}
	//	else{
			qr.update("UPDATE qiandao SET description= '迟到' WHERE uid = ? AND TO_DAYS(starttime)= TO_DAYS(NOW());",uid);
	//	}
		
	}

	// 签退
	public void qiantui(String uid) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDs());
		java.sql.Timestamp date = DateUtil.getDateTime();
		int hour = date.getHours();

	//	if((hour<=10&&hour>0)){
			qr.update("UPDATE qiandao SET endtime =NOW() WHERE uid = ? AND TO_DAYS(starttime)= TO_DAYS(NOW());",uid);
	//	}
	//	else if((hour<=15&&hour>12)){
			qr.update("UPDATE qiandao SET endtime1 = NOW() WHERE uid = ? AND TO_DAYS(starttime)= TO_DAYS(NOW());",uid);
	//	}
	//	else if((hour>19&&hour<=0)){
			qr.update("UPDATE qiandao SET endtime2 =NOW() WHERE uid = ? AND TO_DAYS(starttime)= TO_DAYS(NOW());",uid);
	//	}
	}

	public QianDao getQiandao(String uid) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDs());
		return qr.query("SELECT * FROM qiandao WHERE uid = ? and TO_DAYS(starttime)= TO_DAYS(NOW());",
				new BeanHandler<QianDao>(QianDao.class), uid);

	}

	public List<QianDao> getSigns(int uid) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDs());
		return qr.query("SELECT * FROM qiandao WHERE uid = ?", new BeanListHandler<QianDao>(QianDao.class), uid);
	}

	public void qingjia(QingJia dayoff) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDs());
		qr.update("insert into qingjia(uid,starttime,endtime,reason,uname,udepartname) values(?,?,?,?,?,?)", dayoff.getUid(),
				dayoff.getStarttime(), dayoff.getEndtime(), dayoff.getReason(),dayoff.getUname(),dayoff.getUdepartname());
	}

	public List<QingJia> getDayOff(int uid) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDs());
		return qr.query("SELECT * FROM qingjia WHERE uid = ?", new BeanListHandler<QingJia>(QingJia.class), uid);
	}
	
	public List<QingJia> getAllDayOff() throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDs());
		return qr.query("SELECT * FROM qingjia ", new BeanListHandler<QingJia>(QingJia.class));
	}
	public List<QingJia> getAllNotAgreeDayOff() throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDs());
		return qr.query("SELECT * FROM qingjia where state = 0", new BeanListHandler<QingJia>(QingJia.class));
	}
	public Department getDepartment(String udepartid) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDs());
		return qr.query("SELECT * FROM department WHERE udepartid = ? ", new BeanHandler<Department>(Department.class),
				udepartid);
	}
	

	public Department departSearch(String udepartname) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDs());
		return qr.query("SELECT * FROM department WHERE udepartname= ? ", new BeanHandler<Department>(Department.class),
				udepartname);
	}

	public List<GongGao> getAllGongGao() throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDs());
		return qr.query("SELECT * FROM gonggao ", new BeanListHandler<GongGao>(GongGao.class));
	}

	public void creatChuChai(ChuChai cc) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDs());
		qr.update("insert into chuchai(uid,addr,starttime,endtime,reason,uname,udepartname) values(?,?,?,?,?,?,?)", cc.getUid(), cc.getAddr(),
				cc.getStarttime(), cc.getEndtime(), cc.getReason(),cc.getUname(),cc.getUdepartname());
	}

	public List<ChuChai> getChuChai(int uid) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDs());
		return qr.query("SELECT * FROM chuchai WHERE uid = ?", new BeanListHandler<ChuChai>(ChuChai.class), uid);
	}
	public List<ChuChai> getAllChuChai() throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDs());
		return qr.query("SELECT * FROM chuchai", new BeanListHandler<ChuChai>(ChuChai.class));
	}

	public void creatGongGao(GongGao gg) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDs());
		qr.update("insert into gonggao(name,time,text) values(?,?,?)", gg.getName(), gg.getTime(), gg.getText());
	}

	public int deleteGongGao(String name) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDs());
		return qr.update("delete FROM gonggao WHERE name = ?", name);
	}

	public List<QianDao> getQianDao(int uid) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDs());
		return qr.query("SELECT * FROM qiandao WHERE uid = ? and description = ?", new BeanListHandler<QianDao>(QianDao.class), uid,"加班");
}

	public List<QianDao> getAllQianDao() throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDs());
		return qr.query("SELECT * FROM qiandao where description = '加班'", new BeanListHandler<QianDao>(QianDao.class));
}

	public void agreeDayOff(String uid, String starttime) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDs());
			qr.update("UPDATE qingjia SET agreetime = NOW() , state = 1 where uid = ? and starttime = ?",uid,starttime);
	}

	public List<Department> getAllDepart() throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDs());
		return qr.query("SELECT * FROM department ", new BeanListHandler<Department>(Department.class));
	}

	public void updatedepart(Department depart) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDs());
		qr.update(
				"update Department set udepartname=?,boss=?,duty=?,tel=?",
				depart.getUdepartname(),depart.getBoss(),depart.getDuty(),depart.getTel());
	}

	public void changeRole(String uid, String urole) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDs());
		qr.update("update user set urole=? where uid =?",urole,uid);
	}

	public void creatKaoQin(KaoQin kq) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDs());
		qr.update("insert into kaoqin(name,time,text) values(?,?,?)", kq.getName(), kq.getTime(), kq.getText());
	}

	public KaoQin getKaoQin() throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDs());
		return qr.query("select * from kaoqin where time = (select time from kaoqin order by time desc limit 1) ", new BeanHandler<KaoQin>(KaoQin.class));
		}

	public void xiaojia(String uid, String starttime) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDs());
		qr.update(
				"update qingjia set state= 2 where uid = ? and starttime=? ",uid,starttime);
	
	}

	public GongGao getGongGao(String name) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDs());
		return qr.query("select * from gonggao where name = ? ", new BeanHandler<GongGao>(GongGao.class),name);
	}

	public User userSearch(String uid) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDs());
		return qr.query("select * from user where uid = ? ", new BeanHandler<User>(User.class),uid);
	}

	

	public void deleteUser(String uid) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDs());
		qr.update("DELETE FROM user WHERE uid= ?",uid);
	
	}

	public void addUser(User user) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDs());
		qr.update(
				"insert into user(uname,usex,udepartid,udepartname,utel,uaddr,umail,uboss,uentrytime,uwork) values( ?,?,?,?,?,?,?,?,?,?)",
				user.getUname(),  user.getUsex(), user.getUdepartid(), user.getUdepartname(),
				user.getUtel(), user.getUaddr(), user.getUmail(), user.getUboss(), user.getUentrytime(),
				 user.getUwork());
	}

	public void deleteDepart(String udepartname) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDs());
		qr.update("DELETE FROM department WHERE udepartname= ?",udepartname);
	}

	public List advancedSearch(String name, String endtime, String starttime, String uid, String udepartname,
			String uname) throws SQLException, ClassNotFoundException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDs());
		//根据name查询不同表
		String sql = "select * from "+name+" where 1 = 1";
		List list = new ArrayList();
		if(!"".equals(uid)){
			sql+=" and uid = ?"; 
			list.add(uid);
		}
		
		if(!"".equals(uname)){
			sql+=" and uname=?";
			list.add(uname);
		}
		if(!"".equals(udepartname)){
			sql+=" and udepartname = ?";
			list.add(udepartname);
		}
		if(!"".equals(starttime)){
			sql+=" and starttime >= ?";
			list.add(starttime);
		}
		if(!"".equals(endtime)){
			sql+="AND endtime <= ?";
			list.add(endtime);
		}
		System.out.println(sql);
		return qr.query(sql, new BeanListHandler<>(Class.forName("domain."+name)),list.toArray());
	}

	public QianDao judgeQiaodao(String uid) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDs());
		return  qr.query("SELECT * FROM qiandao WHERE uid = ? AND TO_DAYS(starttime)=TO_DAYS(NOW()) ;",new BeanHandler<QianDao>(QianDao.class),uid);
	}

	public void setQueQin(String uid) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDs());
		System.out.println("hahah");
		qr.update("insert into qiandao(uid,description,starttime) values(?,?,?)",uid,"缺勤",DateUtil.getDateTime());		
	}

	public void createDepart(Department dp) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDs());
		qr.update("insert into department(udepartid,udepartname,duty,boss,tel) values(?,?,?,?,?)",dp.getUdepartid(),dp.getUdepartname(),dp.getDuty(),dp.getBoss(),dp.getTel());		
	}


}
