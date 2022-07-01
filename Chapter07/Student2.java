public class Student2 {
	int japanese;
	int math;
	int english;
	
	void setScore(int j, int m, int e) { //引数
		japanese = j;					//setScoreメソッドで使用
		math = m;
		english = e;
		
		System.out.println("各科目の得点をセットしました。");		
	}
	
	void show() {
		System.out.println("国語：" + japanese);
		System.out.println("数学：" + math);
		System.out.println("国語：" + english);
	}
	//メソッド内で宣言したローカル変数は初期化できないのでint型で明示した
	int getTotal() {
		return japanese + math + english;
	}
}
