class Example_17_5 {
	public static void main(String[] args) {
		SubThread s = new SubThread();
		s.start();
		System.out.println("main:サブスレッドの終了を待ち");
		
		//サブスレッドが終了するのをまつjoinメソッド
		try {
			Thread.sleep(500);
			//s.interrupt();//割込み処理
			s.join();//スレッドの待ち合わせ
			
		}
		catch(InterruptedException e) {}
		
		System.out.println("main:サブスレッドが終了しました。");
	}
}
