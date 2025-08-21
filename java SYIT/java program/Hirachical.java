class Animal{
	void eat(){
		System.out.println("Animal Eat");
}
}
class Dog extends Animal{
	void Bark(){
		System.out.println("Dog");
}
}
class Cat extends Animal{
	void meow(){
		System.out.println("Cat");
}
}
public class Hirachical{
	public static void main(String[] args){
		Dog d = new Dog();
		Cat c = new Cat();
		c.eat();
		c.Bark();
		c.meow();
}
}