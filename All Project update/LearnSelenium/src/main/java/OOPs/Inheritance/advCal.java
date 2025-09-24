package OOPs.Inheritance;

public class advCal extends calc{
	public int divide(int a,int b) {
		try {
			return a/b;
		}catch(ArithmeticException e) {
			return 0;
		}
		
	}
	
	public static void main(String[] args) {
		advCal obj=new advCal();
		int add=obj.add(5, 10);
		int divide=obj.divide(10, 0);
		System.out.println("Add from another class : "+add);
		System.out.println(divide);
	}

}
