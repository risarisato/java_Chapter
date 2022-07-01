//例外処理エラー処理
class Example_16_2 {
	public static void main(String[] args) {
		int[] data = {10, 20, 30};
		//tryには例外が起きた処理
		try {
			data[5] = 50;	
		}
		catch(Exception e) {//例外の処理
			System.out.println("例外が発生しました。");
		}
		System.out.println("プログラムを正常に終了します。");
	}
}
