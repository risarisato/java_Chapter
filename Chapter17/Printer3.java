class Printer3 extends Thread {
	
	public Printer3(String name) {
		super(name);//名前の設定
	}
	public void run() {
		for(int i = 0; i < 10; i++) {
			//getName()スレッド名の取得
			System.out.print(getName());
		}
	}
}	
