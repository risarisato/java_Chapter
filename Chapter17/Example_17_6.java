class Example_17_6 {

	public static void main(String[] args) {
		Printer5 p = new Printer5();
		p.start();
		try {
			Thread.sleep(50);//50ミリ秒待機
		}
		catch(InterruptedException e) {}
		
		//パソコンの処理が高速のため\nで改行している
		System.out.println("\n main：サブスレッドを終了させます。");
		p.end();//サブスレッドを終了させる
	}

}
