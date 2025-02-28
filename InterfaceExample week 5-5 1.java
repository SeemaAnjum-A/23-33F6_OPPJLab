interface Interface{
void display();
}
class first implements Interface{
public void display(){
System.out.println("Hello everyone");
}
}
class second implements Interface{
public void display(){
System.out.println("Good morning");
}
}
class InterfaceExample{
public static void main(String[] args){
first fi=new first();
second se=new second();
fi.display();
se.display();
}
}