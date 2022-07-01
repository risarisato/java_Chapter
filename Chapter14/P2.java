class P2 extends Paragraph {
	P2(String text){
		super(text);
	}
	//親の処理を必ず書く
	public void showHeader() {
		System.out.println("<paragraph>");
	}
	public void showFooter() {
		System.out.println("</paragraph>");
	}
}
