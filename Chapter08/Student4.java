
public class Student4 {
	int japanese;
	int math;
	int english;
	
	//コンストラクタ宣言
	Student4(int japanese, int math, int english){
		this.japanese = japanese;
		this.math = math;
		this.english = english;
		System.out.println("コンストラクタを実行しました。");
	}
		void show() {
			System.out.println("国語：" + japanese);
			System.out.println("数学：" + math);
			System.out.println("英語：" + english);
		}
}
