class Students{
int phy = 78;
int chem = 75;
int math = 88;
void show(){
System.out.println("Sanjivani");
}
}
class Sem1 extends Students{
int display(){
return phy+chem+math/3;
}
}
public class Mark{
public static void main(String[] args){
Sem1 s = new Sem1();
s.show();
int a = s.display();
System.out.println(a);

}
}