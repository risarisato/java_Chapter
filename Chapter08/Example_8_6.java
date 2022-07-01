
public class Example_8_6 {
	public static void main(String[] args) {
		
		Student4[] st;//Student4型の配列変数の表記
		//オブジェクト配列[3]の中にfor文それぞれ表示されている
		st = new Student4[3];
		
		for(int i = 0; i < st.length; i++) {
			st[i] = new Student4(i*10, i*10, i*10);
		}
		
		for(int i =0; i < st.length; i++) {
			st[i].show();
		}
	}
}
