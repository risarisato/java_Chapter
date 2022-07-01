class Example_17_1 {
	public static void main(String[] args) {
		
		//インスタンスの作成
		Printer p = new Printer();
		//スレッドのstartで実行開始する
		p.start();
		
		for(int i = 0; i < 100; i++) {
			System.out.print("M");
		}
	}
}
