class Example_13_3 {

	public static void main(String[] args) {
		
		//Goods型配列でGoods[] g =｛(_),(_) ,(_)｝;インスタンス化
		Goods[] g = {
				new Goods("ハンカチ", 750),
				new Computer("パソコンA", 10000, "Win2004", 256),
				new Computer("パソコンB", 15000, "WinYP", 512),
				new Clothes("Jeans390", 4000, "青", "LL")
		};
		
		int total = 0;
		for(int i = 0; i < g.length; i++) {
			g[i].show();//インスタンス種類によって動作が異なる
			total += g[i].getPrice();//各インスタンス処理
		}
		System.out.println("--------------");
		System.out.println("合計金額：" + total + "円");
	}
}
