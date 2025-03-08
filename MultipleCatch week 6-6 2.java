class MultipleCatch{
	public static void main(String[] args){
		try{
			int result=10/0;
			System.out.println(result);
			int[] num={1,2,3,4};
			System.out.println(num[2]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Error:Array index is out of bounds.");
		}
		catch(ArithmeticException e){
			System.out.println("Error:cannot divide with Zero");
		}
	}
}