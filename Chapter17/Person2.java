class Person2 extends Thread {
	Account a;
	int yen; //入金額
	
	public Person2
	(Account a, String name, int yen) {
		super(name);
		this.a = a;
		this.yen = yen;
	}
	
	public void run() {
		//yen円を入金
		synchronized (a) {
		a.nyukin(yen, getName());
		}
	}
}
