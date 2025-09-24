package LearnJava;

public class starTrangle {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(j+" ");
			
			}
			for(int k=1;k<=i;k++) {
				System.out.print(i+" ");
			
			}
			System.out.println();
		}
		
		String name="madam1";
		String palindro="";
		for(int i=name.length()-1;i>=0;i--) {
			palindro+=name.charAt(i);
		}
		if(name.equals(palindro)) {
			System.out.println("Palindrome : "+palindro);
		}
		else{
			System.out.println("No Palindrome : "+palindro);
		}
		
		
		for(int i =0;i<=5;i++) {
			System.out.println(i);
		}
		int i=0;
		while(i<=5) {
			System.out.println("while loop : "+i);
			i++;
		}
		int j=0;
		do {
			System.out.println("Do while loop : "+j);
			j++;
		}
		while(j<=5);
		
	}
	

}
