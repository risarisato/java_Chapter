class Account {
	private int amount;//預金額
	
	//public synchronized void nyukin(int yen, String name) {
	public void nyukin(int yen, String name) {
		int work = amount;//現在の預金額
		
		System.out.println
		(name + "が" + yen + "円入金します。");
		
		try {
			Thread.sleep(100);
		}
		catch(InterruptedException e) {}
		
		work += yen;//入金額の加算
		amount = work;//預金額の更新
	}
	
	public int get() {
		return amount;
	}
}
