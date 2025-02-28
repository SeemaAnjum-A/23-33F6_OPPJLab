class main{
void display(){
System.out.println("This is main class");
}
}
class sub1 extends main{
void display(){
System.out.println("The subclass one is extended from main class");
}
}
class sub2 extends main{
void display(){
System.out.println("The subclass two is extended from main class");
}
}
class RuntimePoly{
public static void main(String[] args){
main m;
m=new sub1();
m.display();
m=new sub2();
m.display();
}
}