package fuc.iecs.oop.pokemon;

public class Pokemon {
	private final String name;
	private int cp;
	
	public Pokemon(String name,int cp){
		this.name=name;
		this.cp=cp;
	}
	
	public String getname(){
		return name;
	}
	
	public void setcp(){
		this.cp=this.cp+500;
	}
	
	public int getcp(){
		return cp;
	}
}
