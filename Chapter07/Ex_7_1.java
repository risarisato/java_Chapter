
public class Ex_7_1 {
	public static void main(String[] args) {
		
		Product p1 = new Product();
		Product p2 = new Product();
		
		p1.name = "りんご"; 
		p2.name = "オレンジ"; 
		
		p1.price = 100;
		p2.price = 80;
			
		p1.stock = 50;
		p2.stock = 25;
			
		System.out.println(p1.name + "    "+"価格:" + p1.price + "円" + "  在庫数：" + p1.stock + "個");
		System.out.println(p2.name + "  価格:" + p2.price + "円" + "   在庫数：" + p2.stock + "個");
		
		
	}
		
}
