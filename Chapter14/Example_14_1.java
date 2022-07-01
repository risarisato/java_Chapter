class Example_14_1 {
	public static void main(String[] args) {
		Figure[] fg = new Figure[3];
		fg[0] = new Rectangle(5.0, 10.0);
		fg[1] = new Circle(5.0);
		fg[2] = new Rectangle(999.0, 99.0);
		for(int i = 0; i < fg.length; i++) {
			System.out.println(i + "番目の図形の面積＝"
					+ fg[i].getArea());
		}
	}

}
