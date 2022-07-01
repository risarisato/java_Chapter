class SomeThread2 extends Thread {
	Object obj;//待機用インスタンスへの参照を保持
	
	public SomeThread2(String name, Object obj) {
		super(name);
		this.obj = obj;
	}
	public void run() {
		System.out.println(getName() + ":待機します");
		
		//待機集合のobjについて待機
		synchronized (obj) {
			try {
				obj.wait();
			}
			catch(InterruptedException e) {}			
		}
		System.out.println(getName() + ":再開しました。");
	}
}
