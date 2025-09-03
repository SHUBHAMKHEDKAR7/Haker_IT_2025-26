abstract class Animal{
	abstract public voice();
	public void eat(){
		System.out.println("Eating");
	}
}
public class Tiger extends Animal{
	public void voice(){
		System.out.println("Voice");
	}
	public static void main(String[] args){
		Tiger t = new Tiger();
		t.voice();
		t.eat();
		
	}
}