
public class Example_10_3 {

	public static void main(String[] args) {
		Person[] team = {
				new Person(72.1, 185.0),
				new Person(68.6, 168.0),
				new Person(92.7, 155.2)
			};
		for(int i = 0; i < team.length; i++) {
			team[i].show();
		}
		Person.showWeightAvg();
		Person.showHeigthAvg();
	}

}
