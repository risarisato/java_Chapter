//サブクラス改造車のイメージで
public class NewOne extends Original {
	public String size;
	
	public NewOne(String color, String size) {
		super(color);//親クラスのコンストラクタを呼び出すsuper
		this.size = size;
	}
	
	public void showSize() {
		System.out.println("サイズは" + size);
	}
}
