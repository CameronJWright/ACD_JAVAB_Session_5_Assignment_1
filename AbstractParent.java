package hello.world;

abstract class Parent {
	String a = "Parent";

	abstract void display();
}

class Child extends Parent {
	void print() {
		System.out.println("Child");
	}

	@Override
	void display() {
		System.out.println(a);

	}

}

public class AbstractParent {

	public static void main(String[] args) {
		Child c = new Child();
		c.display();
		c.print();
	}

}
