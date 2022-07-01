
public class Example_7_4 {

	public static void main(String[] args) {
		
		// Student2のクラスをnewで参照している
		Student3 st = new Student3();
		st.setScore(58, 93, 78);
		
		System.out.println("合計：" + st.getTotal());
		System.out.println("合計：" + st.getAverage());
	}
}


