import java.util.Random;
class Example_19_5 {

	public static void main(String[] args) {
		//ランダムジェネレータを作成
		Random r = new Random();
		
		for(int i = 0; i < 10; i++) {
			//nextInt(）でint型の疑似乱数をつくる
			System.out.print(r.nextInt(100) + " ");
		}

	}

}
