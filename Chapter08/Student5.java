
public class Student5 {
	int japanese;
	int math;
	int english;
	
	//引数なしのコンストラクタ
	Student5(){
		//引数3つのコンストラクタを呼び出す
		this(100, 100, 100);
	}
	
	//コンストラクタ宣言
	Student5(int japanese, int math, int english){
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
