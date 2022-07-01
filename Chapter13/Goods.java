
class Goods {
	protected String name; //商品名文字列オブジェクト
	protected int price;   //価格
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public void show() {
		System.out.println("--------------");
		System.out.println("新商品：" + name);
		System.out.println("価格：" + price);
	}
	public int getPrice() {
		return price;
	}
}
