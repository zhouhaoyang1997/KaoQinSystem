package util;

import java.util.List;

import domain.ChuChai;
import domain.GongGao;
import domain.QingJia;
import domain.QianDao;

public class ListUtil {
	public static <T> List<T> GetList(String name){
		if(name.equals("kaoqin")){
			List<QianDao> Ulist = null;
		}
		else if(name.equals("qingjia")){
			List<QingJia> Ulist = null;
		}
		else if(name.equals("chuchai")){
			List<ChuChai> Ulist = null;
		}
		else if(name.equals("gonggao")){
			List<GongGao> Ulist = null;
		}
		List<T> Ulist = null;
		return Ulist;
	}
}
