class Example_17_4 {
	public static void main(String[] args) {
		Printer4 p = new Printer4();
		p.start();
		
		for(int i = 0; i < 20; i++) {
			System.out.print("M");
			
			try {
				Thread.sleep(100);//スレッド100ミリ秒停止
			}
			catch(InterruptedException e) {}
		}

	}

}
