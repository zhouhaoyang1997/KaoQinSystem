package util;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		String className = "domain.QingJia"; // 类名
		Class myClass = Class.forName( className ); // 获得类
		Object myObject = myClass.newInstance(); // 构造对象
		System.out.println(myObject);
	}
}
