class Example_15_2 {
	public static void main(String[] args) {
		Rectangle2 rec1, rec2;
		rec1 = new Rectangle2(5.0, 10.0);
		rec2 = new Rectangle2(10.0, 10.0);
		rec1.show();
		rec2.show();
		
		System.out.println(rec1.compareTo(rec2) > 0 ?
				"rec1 is bigger" : "rec2 is bigger");
		rec1.enlarge(2);
		rec1.show();
		System.out.println(rec1.compareTo(rec2) > 0 ?
				"rec1 is bigger" : "rec2 is bigger");
	}
}
