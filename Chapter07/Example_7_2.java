public class Example_7_2 {
	
	public static void main(String[] args) {

		//インスタンスが2個できている
		Student st1 = new Student();
		Student st2 = new Student();
		
		st1.japanese = 58;
		st2.japanese = 91;
	
		
		System.out.println("st1の国語：" + st1.japanese);
		System.out.println("st2の国語：" + st2.japanese);
	}

}

