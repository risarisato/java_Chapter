class Example_17_2 {
	public static void main(String[] args) {
		
		//Printer2インスタンスを生成
		Printer2 p = new Printer2();
		
		//Threadインスタンスを生成
		Thread t = new Thread(p);
		
		//スレッド実行開始
		t.start();
		
		for(int i = 0; i < 100; i++) {
			System.out.print("M");
		}
	}

}
