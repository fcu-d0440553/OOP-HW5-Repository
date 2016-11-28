package fuc.iecs.oop.pokemon;

public class Main {
	
	public static void main(String[] args) {
		
		Pokemon p1 = new Pokemon("Psyduck",100);
		Pokemon p2 = new Pokemon("Pikachu",300);
		System.out.print(p1.getname());
		System.out.println(" "+p1.getcp());
		System.out.print(p2.getname());
		System.out.println(" "+p2.getcp());
		GYM.fight(p1, p2);
		System.out.print(p1.getname());
		System.out.println(" "+p1.getcp());
		System.out.print(p2.getname());
		System.out.println(" "+p2.getcp());


	}
}
