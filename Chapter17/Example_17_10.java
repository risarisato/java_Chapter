class Example_17_10 {
	public static void main(String[] args) {
		SomeThread st = new SomeThread();
		st.start();
		
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e){}
		System.out.println("サブスレッドを再開します。");
		
		//インスタンスstについて待機中スレッドを1つ再開する
		synchronized (st) {
			st.notify();
			
		}
	}
}
