class Printer5 extends Thread {
	
	//スレッド制御に用いるフラグ
	private boolean contFlag = true;
	
	//スレッドを終了させるときに呼び出す
	public void end() {
		contFlag = false;
	}
	
	//フラグがtrueの間、続ける
	public void run() {
		System.out.println("*---sub開始します---*");
		while(contFlag) {
			System.out.print("T");
			try {
				sleep(2);
			}catch(InterruptedException e) {}
		}
		System.out.println("sub:終了しました");
	}
}
