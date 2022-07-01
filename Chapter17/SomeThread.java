class SomeThread extends Thread {
	public void run() {
		System.out.println("待機します。");
		
		synchronized (this) {
			try {
				wait();//this.wait()と同じ自インスタンス
			}
			catch(InterruptedException e) {}
		}
			
		System.out.println("再開しました。");
	}
}

