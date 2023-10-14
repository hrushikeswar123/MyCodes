package polymorphism;

public class App {
	public static void main(String[] args) {
		Parent p1=new Parent();
		p1.eyeColor();
		p1.skinColor();
		p1.height();
		p1.weight();
		System.out.println("-------");
		Child c1=new Child();
	c1.eyeColor();
		c1.skinColor();
		c1.height();
		c1.weight();
		c1.pubg();
		c1.insta();
	}

}
