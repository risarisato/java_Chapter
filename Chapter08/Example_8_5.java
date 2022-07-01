
public class Example_8_5 {

	public static void main(String[] args) {
		Student st1, st2;
		
		st1 = new Student(); //インスタンス作成
		st2 = st1;			 //参照を代入
		
		st2.japanese = 93;
		System.out.println("st1の国語" + st1.japanese);
		System.out.println("st2の国語" + st2.japanese);
		//st1の国語93→参照が同じため
		//オブジェクト変数は参照をしているだけ
	}
}
