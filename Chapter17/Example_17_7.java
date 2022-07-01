class Example_17_7 {

	public static void main(String[] args) {
		Account a = new Account();
		
		Person2 pa = new Person2(a, "A", 5000);
		Person2 pb = new Person2(a, "B", 10000);
		
		pa.start();
		pb.start();
		
		//すべての入金処理の終了を待つ
		try {
			pa.join();
			pb.join();
		}
		catch(InterruptedException e) {}
		System.out.println("入金後の預金額："
				+ a.get() + "円");
	}

}
