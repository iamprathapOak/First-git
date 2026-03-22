 class Animal {
	 
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
	
    void sound() {
		super.sound();
        System.out.println("Dog barking");
    }
}

public class Guva {

    public static void main(String[] args) {
		
        Animal a = new Dog();
		Dog a1 = new Dog ();
        a.sound();
		a1.sound();
    }
}