
public class Example_7_1 {

	public static void main(String[] args) {
		//studentクラス名 stオブジェクト変数
		//インスタンスを参照するためのst変数を宣言
		Student st;
		st = new Student();
		
		st.japanese = 58;
		st.math = 93;
		st.english = 78;
		
		System.out.println("国語：" + st.japanese);
		System.out.println("数学：" + st.math);
		System.out.println("国語：" + st.english);

	}

}
