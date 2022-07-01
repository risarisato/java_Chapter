public class Student3 {
	
	// thisの利用で引数でなく「フィールド」を利用した
	int japanese;
	int math;
	int english;
	void setScore(int japanese, int math, int english) { 
		
		// thisをつけることで「フィールド」の自オブジェクトの値を持ってくれる
		this.japanese = japanese;					
		this.math = math;
		this.english = english;
		
		System.out.println("各科目の得点をセットしました。");		
	}
	//メソッド内で宣言したローカル変数は初期化できないのでint型で明示した
	int getTotal() {
		return japanese + math + english;
	}
	
	double getAverage() {
		return getTotal() / 3.0;
	}
}
