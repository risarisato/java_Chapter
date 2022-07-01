class Example_Anonymous {

	public static void main(String[] args) {
		(new SuperClass() {
			public void showMsg() {
				System.out.println("Message_合併");
			}
		}).showMsg();

		
		SuperClass s = new SuperClass() {
			public void showMsg() {
				System.out.println("Message_分離");
			}
		};
		s.showMsg();
	}

}
