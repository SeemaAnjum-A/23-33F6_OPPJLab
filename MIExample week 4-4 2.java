class One{
   void DisplayA(){
       System.out.println("Base class");
   }
}
class Two extends One{
      void DisplayB(){
        System.out.println("Derived Class");
      }
}
class Three extends Two{
      void DisplayC(){
         System.out.println("Derived class of Two");
      }
}
class MIExample{
   public static void main(String args[]){
       Three t=new Three();
        t.DisplayA();
        t.DisplayB();
        t.DisplayC();
   }
}
