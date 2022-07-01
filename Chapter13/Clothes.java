
class Clothes extends Goods{
	private String color;
	private String size;
	
	
	public Clothes(String name, int price, String color, String size) {
		//親のクラス
		super(name, price);
		this.color = color;//自分のクラス
		this.size = size;//自分のクラス
	}
	
	//オーバライドしている
	public void show() {
		super.show();//スーパークラスメソッドで実行
		System.out.println("色は" + color);//サブクラス独自の処理1
		System.out.println("サイズは" + size);//サブクラス独自の処理2
	}
}
