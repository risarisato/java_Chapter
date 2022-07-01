class SubThread extends Thread {
	public void run() {
		System.out.println("sub:処理開始");
		
		//try～catchで2秒まつ
		try {
			sleep(2000);
		}
		catch(InterruptedException e) {
		//System.out.println("--割込み発生です--");
		}
		
		System.out.println("sub:終了しました。");
	}

}
