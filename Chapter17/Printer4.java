class Printer4 extends Thread {
	public void run() {
		for(int i = 0; i < 20; i++) {
			System.out.print("T");
			
			try {
				sleep(300);//スレッド300ミリ秒停止
			}
			catch(InterruptedException e) {}
		}
	}

}
