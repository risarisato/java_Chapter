class P1 extends Paragraph {
	private String hfString;
	P1(String text, String hfString){
		super(text);
		this.hfString = hfString;
	}
	//親の処理を必ず書く
	public void showHeader() {
		System.out.println(hfString);
	}
	public void showFooter() {
		System.out.println(hfString);
	}
}