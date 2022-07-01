class Example_15_1 {
	public static void main(String[] args) {
		Person[] p = {
				new Person("Armstrong", 26, 172),
				new Person("Collins", 40, 170),
				new Person("Aldrin", 37, 168),
				new Person("Gorden", 21, 180)
		};
		Tool.sort(p);
		for(int i = 0; i < p.length; i++) {
			p[i].show();
		}
	}
}
