class Computer extends Goods{//コンピュータを表している
	private String osType;
	private int memory;
	public Computer(String name, int price, String osType, int memory) {
	super(name, price);
	this.osType = osType;
	this.memory = memory;
	}
	//オーバライドしている
	public void show() {
		super.show();
		System.out.println("OSタイプ" + osType);
		System.out.println("メモリ" + memory);
	}
}