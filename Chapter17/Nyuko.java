class Nyuko extends Thread {
	Souko souko;
	
	public Nyuko(Souko souko) {
		this.souko = souko;
	}
	
	//倉庫が開いている間は、繰り返す。
	public void run() {
		while(souko.getFlag()) {
			souko.in(100);
			try {
				sleep(1000);
			}
			catch(InterruptedException e) {}
		}
	}
}
