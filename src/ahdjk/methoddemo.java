package ahdjk;

public class methoddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methoddemo d = new methoddemo();
		String name = getData();
		System.out.println(name);
		Methoddemo2 d2 = new Methoddemo2();
		String name2 = d2.getuserData();
		System.out.println(name2);

	}
	public static String getData() {
		System.out.println("hello");
		return "Ahad Khan";
	}

}
