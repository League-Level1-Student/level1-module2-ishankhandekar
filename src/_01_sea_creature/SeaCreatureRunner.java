package _01_sea_creature;

public class SeaCreatureRunner {
	public static void main(String[] args) {
		SeaCreature sc = new SeaCreature("Spongebob");
		SeaCreature ss = new SeaCreature("Squidward");
		SeaCreature sp = new SeaCreature("Patrick");
		sc.laugh();
		sc.eat();
		ss.laugh();
		ss.eat();
		sp.laugh();
		sp.eat();
		System.out.println(sc.getName());
	}
}
