class Person implements Comparable {//インターフェース実装
	private String name;
	private int age, height;//年齢と身長
	public Person(String name, int age, int height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	public void show() {
		System.out.println
		(name + ":" + "age.." + age + ", height.." + height);
	}
	//抽象メソッドのオーバライド
	public int compareTo(Object obj) {
		//参照でもらっているのキャストしている
		Person another = (Person)obj;
		return age - another.age;
	}
}
