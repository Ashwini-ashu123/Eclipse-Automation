package LearnJava;

public class stringObjectConstructor {
	int a=20;
	String b="Check which string will work";
	int c=10;
	
	public void m1(){
		System.out.println("No return type");
	}
	
	public void m2(int a, String b,int c) {
		this.a=a;
		this.b=b;
		int z=a+c;
		long n=11111111111l;
		System.out.println(b+z);
	}
	
	  

	
	public String m3(int a,String b, int c) {
		String z=a+b+c;
		return z;
	}
	public static int m4(int a,int b) {
		return a+b;
	}
	
	// static and non static
	
	String name;
	int pincode=118; // non static
	static String college=" Hindutan"; // static 
	
// 	stringObjectConstructor(String n){
//		name=n;
//		}
	
	void display() {
		System.out.println("Non static " +pincode+" and Static "+college);
	}
	public static void main(String[] args) {
		stringObjectConstructor obj=new stringObjectConstructor();
		obj.display();
		System.out.println("------------------");
		stringObjectConstructor obj1=new stringObjectConstructor();
		obj1.pincode=999; 
		stringObjectConstructor.college=" VIT"; // we can change static through class name its recommended and its will change in class itself
		obj1.display();
		System.out.println("------------------");
		stringObjectConstructor obj3=new stringObjectConstructor();
		obj3.display();
		System.out.println("------------------");
		obj.m1();
		obj.m2(5, "No reurn type with parametre ", 10);
		String m4=obj.m3(2," return typ with parameter ",  5);
		System.out.println(m4);
		int a=stringObjectConstructor.m4(3, 4);
		System.out.println(a);
		
		
	
	}

}
