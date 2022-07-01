abstract class Paragraph {
	protected String text;
	Paragraph (String text){
		this.text = text;
	}
	public void show() {
		showHeader();//通常メソッド
		System.out.println(text);
		showFooter();//抽象メソッド
	}
	//抽象メソッドの呼び出し
	public abstract void showHeader();
	public abstract void showFooter();

}
