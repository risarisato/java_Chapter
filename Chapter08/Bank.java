
public class Bank {
	//フィールド値は、外から隠すためprivateにする
	private int account;
	
	public Bank(int money) {
		if(money > 0) {
			account = money;
		}
		System.out.println("新規口座を作成しました");
		show();
	}
	private void show() {
		System.out.println("預金額：" + account + "円");
	}
	
	//フィールド利用のためメソッドはpublicにする
	public void in(int money) {
		if(money > 0) {
			account += money;
			System.out.println(money + "円入金しました。");
	}
		else{
		
	System.out.println("入金額が不正です");
		}
	show();
	}
	
	//フィールド利用のためメソッドはpublicにする
	public void out(int money) {
		if(account >= money) {
			account -= money;
			System.out.println(money + "円出金しました");
	}else {
		System.out.println("出勤額が不正です");
	}
		show();
	}
}

