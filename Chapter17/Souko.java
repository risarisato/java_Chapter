class Souko {
	private int zaiko;//在庫数
	//入・出庫を制御するフラグ
	private boolean contFlag = true;
	
	public int getZaiko() {
		return zaiko;
	}
	public boolean getFlag() {
		return contFlag;
	}
	
	//このスレッドを呼ぶことで入・出庫を終了
	public synchronized void close() {
		contFlag = false;
		notifyAll();//待機中スレッドすべて再開
	}
	
					//inは入庫用メソッド
	public synchronized void in(int num) {
		zaiko += num;
		System.out.println(num + "個入庫しました。");
		notifyAll();//入庫したことを通知
	}
	
					//outは出庫用メソッド
	public synchronized void out(int num) {
		while(contFlag) {
			
			if(zaiko < num) {//在庫不足なら
				System.out.println("在庫不足です。");
				try {
					wait();//待つ
				}
				catch (InterruptedException e) {}
			}
			
			else {
				zaiko -= num;//在庫があれば出庫
				System.out.println(num + "個出庫しました。");
				break;
			}
		}
	}
}
