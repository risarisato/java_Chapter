
public class ItemCase {
	public Item it1;
	public Item it2;
	ItemCase(Item it1, Item it2){
		this.it1 = it1;
		this.it2 = it2;
	}
	
	public void show() {
		System.out.println("Item1:number = " 
							+ it1.number +
							", price = " 
							+ it1.price);
		System.out.println("Item2:number = " 
							+ it2.number +
							", price = "
							+ it2.price);
	}
}
