public class Example_7_3 {

	public static void main(String[] args) {
		
		// Student2のクラスをnewで参照している
		Student2 st = new Student2();
		
		st.setScore(58, 93, 78);
		
		st.show();
		
		//メソッド内で宣言したローカル変数は初期化できないのでint型で明示した
		int total = st.getTotal();
		
		System.out.println("合計：" + total);

	}

}
