package fuc.iecs.oop.pokemon;

public class GYM {
	public static void fight(Pokemon p1,Pokemon p2){
		int a = (int)(Math.random()*10+1);
		if(a%2==0)
		{
			System.out.println(p1.getname()+" win");
			p1.setcp();
		}
		else
		{
			System.out.println(p2.getname()+" win");
			p2.setcp();
		}
	}
}
