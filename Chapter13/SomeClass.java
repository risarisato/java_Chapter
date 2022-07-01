class SomeClass {
	
	//すべてのクラスのインスタンスを受け取れる
	public static void cheak(Object obj){
		
		//オブジェクトはすべての大元で暗黙的な拡張しいている
		//objはStringインスタンスか？
		if(obj instanceof String) {
			System.out.println("objはStringインスタンス");
		}
		
		if(obj instanceof Object) {
			System.out.println("objはobjインスタンス");
		}
		
		if(obj instanceof StringBuffer) {
			System.out.println("objはStringBufferインスタンス");
		}	
	}
}