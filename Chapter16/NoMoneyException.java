//Exceptionクラスを拡張した例外クラス
class NoMoneyException extends Exception {
	private int money;
	//不正な取引金額を受け取る
	public NoMoneyException(int money) {
		this.money = money;
	}
	public String toString() {
		return "不正な取引金額：" + money + "円"; 
	}
}
