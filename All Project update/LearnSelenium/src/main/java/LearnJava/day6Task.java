package LearnJava;

public class day6Task {
	public int mark(int m1,int m2,int m3 ) {
		return m1+m2+m3;
	}
	
	public String avrgmark(int totalmark,String name) {
		int average= totalmark/3;
		if (average> 70) {
			return name+"Student pass";
		}
		else{
			return name+"Student fail";
		}
	}
	
	
	
	public static void main(String[] args) {
		day6Task result=new day6Task();
		int Student1=result.mark(60, 60, 80);
		String grade=result.avrgmark(Student1,"David ");
		System.out.println(grade);
		
		///////////////////////////////////////////////////
		String name="I am java developer";
		String word[]=name.split("");
		
		for(int i=0;i<word.length;i++) {
			System.out.println(word[i]);
		}
		
		String x1="hai how are you";
		String indi[]=x1.split("o");
		for(int i=0;i<indi.length;i++) {
			System.out.println(indi[i]);
		}
		
		
		
		
		
	}

}
