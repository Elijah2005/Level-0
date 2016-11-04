
public class Runner2 {
public static void main(String[] args) {
	
	
	SeaCreature spongebob = new SeaCreature("spongebob");
	SeaCreature squidward = new SeaCreature("squidward");
	SeaCreature patrick = new SeaCreature("patrick");
	System.out.println(spongebob.getName());
	spongebob.eat();
	spongebob.laugh();
	squidward.eat();
	squidward.laugh();
	patrick.eat();
	patrick.laugh();
}
}
