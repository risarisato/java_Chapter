//親クラス(ただの車イメージ元のクラス)
public class Original {
	public String color;
	
	public Original(String color) {
		this.color = color;
	}
	
	public void showColor(){
		System.out.println("色は" + color);
	}
}
