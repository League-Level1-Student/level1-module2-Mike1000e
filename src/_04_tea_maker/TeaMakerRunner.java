package _04_tea_maker;

public class TeaMakerRunner {
	public static void main(String[] args) {
		TeaBag tea = new TeaBag("Passion Fruit");
		Cup cup = new Cup();
		Kettle ket = new Kettle();
		ket.boil();
		cup.makeTea(tea, ket.getWater());
		
		
		
		
	}
}
