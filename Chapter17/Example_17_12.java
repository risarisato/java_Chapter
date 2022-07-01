class Example_17_12 {
	public static void main(String[] args) {
		Souko souko = new Souko();
		Nyuko n = new Nyuko(souko);
		Syukko s = new Syukko(souko);
		n.start();
		s.start();
		try {
			Thread.sleep(10000);
		}
		catch(InterruptedException e) {}
		
		//倉庫を閉める
		souko.close();
		System.out.println("終了後の在庫数："+ souko.getZaiko());

	}

}
