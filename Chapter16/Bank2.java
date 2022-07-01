class Bank2 {
	private int account;//預金額を表す
	//NoMoneyExceptionを送出することを明示
	public Bank2(int money)throws NoMoneyException{
		//入金額をチェック
		if(money > 0) {
			account = money;
		}
		else {
			//NoMoneyExceptionを発生させる
			throw new NoMoneyException(money);
		}
		System.out.println("新規口座を作成しました。");
		show();
	}
	private void show() {
		System.out.println("預金額：" + account + "円");
	}
	public void in(int money)throws NoMoneyException{
		if(money > 0) {
			account += money;
			System.out.println(money + "円入金しました。");
			show();
		}
		else {
			throw new NoMoneyException(money);
		}
	}
	public void out(int money)throws NoMoneyException{
		//出金額と現在の預金額をチェック
		if(money > 0 && account >= money) {
			account -= money;
			System.out.println(money + "円入金しました。");
			show();
		}
		else {
			throw new NoMoneyException(money);
		}
	}
}
