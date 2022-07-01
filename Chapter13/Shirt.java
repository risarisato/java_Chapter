//サブクラス
class Shirt	extends Cloth {
	String size = "M";
	//オーバライド
	//親からshow(メソッド)で中身を改造する
	//String color = "white"はフィールド！！
	public void show() {
		System.out.println
		("色は" + color + "で、サイズは" + size);
		super.show();
	}
}
