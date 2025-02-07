class One{
	void DisplayA()
	{
		System.out.println("Base Class");
	}
}
class Two extends One{
	void DisplayB()
	{
		System.out.println("Derived class");
	}
}
class SIExample{
	public static void main(String[] args){
		Two t=new Two();
		t.DisplayA();
		t.DisplayB();
	}
} 