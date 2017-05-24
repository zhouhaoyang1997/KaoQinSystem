package util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3P0Util {
	//得到连接池
	public static DataSource ds = new ComboPooledDataSource();
	public static DataSource getDs() {
		return ds;
	}
	//得到连接
	public static  Connection getConnection(){
		try {
			return ds.getConnection();
		} catch (SQLException e) {
			throw new RuntimeException("服务器错误！");
		}
	}
	//释放
	public static void release(Connection conn,Statement sta,ResultSet rs){
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			rs = null; //释放完记得变为null
		}
		if(sta!=null){
			try {
				sta.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			sta = null;
		}
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			conn = null;
		}
	}
}
