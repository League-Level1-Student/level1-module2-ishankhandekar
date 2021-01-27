package _02_smurf;

public class SmurfRunner {
	public static void main(String[] args) {
		Smurf s = new Smurf("Handy Smurf");
		s.eat();
		System.out.println(s.getName());
		Smurf su = new Smurf("Smurfette");
		
		System.out.println(su.getName());
		System.out.println(su.getHatColor());
		System.out.println(su.isGirlOrBoy());
Smurf sp = new Smurf("Papa");
		
		System.out.println(sp.getName());
		System.out.println(sp.getHatColor());
		System.out.println(sp.isGirlOrBoy());
	}
}
