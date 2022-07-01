class Example_16_4 {
	public static void main(String[] args) {
		try {
			if(args.length !=2 ) {
				throw new Exception();
			}
			System.out.println(args[0]);
			System.out.println(args[1]);
		}
		catch(Exception e) {
			System.out.println("例外発生：" + e);
		}
	}
}
