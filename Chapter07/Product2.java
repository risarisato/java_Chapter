
public class Product2 {
	
	String name;
	int price;
	int stock;
		
	void setProduct(String name, int price, int stock) {
		this.name = name;
		this.price = 100;
		this.stock = 50;
			
		System.out.println(name + "の価格、在庫数をセットしました。");		
	}
	void show() {
			System.out.println(name + "の価格;" + price + "円");
			//System.out.println(name + "の価格;" + price + "円");
		}
}
