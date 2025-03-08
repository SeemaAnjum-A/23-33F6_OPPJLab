class BuiltInException{
public static void main(String[] args){
try{
int result=10/0;
System.out.println(result);
}
catch(ArithmeticException e){
System.out.println("Error:"+e);
}
try{
int[] arr={1,2,3};
System.out.println(arr[5]);
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("Error:"+e);
}
try{
String str=null;
System.out.println(str.length());
}
catch(NullPointerException e){
System.out.println("Error:"+e);
}
}
}