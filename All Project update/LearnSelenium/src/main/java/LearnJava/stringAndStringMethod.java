package LearnJava;

public class stringAndStringMethod {
	public static void main(String[] args) {
		String name = "Welcome to Java";
		String[] arr = name.split(" ");

		System.out.println("Original name : " + name);
		System.out.println("Original name : " + name.length());
		System.out.println("Original name : " + name.charAt(4));
		System.out.println("Original name : " + name.concat(" Class"));
		System.out.println("Original name : " + name);
		System.out.println("Original name : " + name.toUpperCase());
		System.out.println("Original name : " + name.substring(0, 5));
		for (int i = 0; i < arr.length; i++) {
			System.out.println("for Loop : " + arr[i]);
		}

		for (String arrs : arr) {
			System.out.println(arrs.substring(0, 2));
		}

		if (name == "Welcome to Java") {
			System.out.println("yes");
		}
		
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(s1.equals(s2));
	}

}
