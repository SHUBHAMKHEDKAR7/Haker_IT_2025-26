class Add{
public final int a = 22;
}
public class Value extends Add{
public int a = 30;

public static void main(String args[]){
Add d = new Add();
Value v = new Value();

System.out.println(d.a);
System.out.println(v.a);
System.out.println(((Add)v).a);
}
}