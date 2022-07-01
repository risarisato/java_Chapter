class Syukko extends Thread {
	Souko souko;
	
	public Syukko(Souko souko) {
		this.souko = souko;
	}
	
	
	//倉庫が開いている間は、繰り返す。
	public void run() {
		while(souko.getFlag()) {
			souko.out(40);
			try {
				sleep(100);
			}
			catch(InterruptedException e) {}
		}
	}
}
