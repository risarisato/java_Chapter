class Example_17_11 {
	public static void main(String[] args) {
		
		//待機集合できるobjで配列の要素のイメージではない
		Object obj = new Object();//待機用のインスタンス
		
		SomeThread2 sta = new SomeThread2("A", obj);
		SomeThread2 stb = new SomeThread2("B", obj);
		sta.start();
		stb.start();
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {}
		System.out.println("サブスレッドを再開させます。");
		
		//すべてのスレッドを再開させる
		synchronized (obj) {
			obj.notifyAll();
			
		}
	}

}
