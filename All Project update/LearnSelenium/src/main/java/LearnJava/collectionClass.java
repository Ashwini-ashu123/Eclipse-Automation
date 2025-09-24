package LearnJava;

import java.util.*;

public class collectionClass {
	public static void main(String[] args) {

		/*
		 * ArrayList, LinkedList ArrayList Allows duplicate,Maintain order,Fast at
		 * retrieving elements (using index)
		 * 
		 * Hashset No duplicate,No order,fast to add,remove
		 * 
		 * TreeSet No duplicate,Sorted elements,Slower than HashSet
		 * 
		 */

		// List
		List<String> fruits = new ArrayList<>();

		fruits.add("Graph");
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Watermelon");
		fruits.add("Apple");
	

		System.out.println(fruits);

		for (String fruit : fruits) {
			System.out.println(fruit);
			if (fruit.equals("Apple")) {
				System.out.println("Equal Apple: True");
			}
		}
		if (fruits.contains("Graph")) {
			System.out.println("Graph in the list");
		}

		fruits.add(1, "Lemon"); // lemon will add in index 1
		fruits.remove("Apple"); // Remove 1st apple
		System.out.println("After removed Apple : " + fruits);

		// Set
		Set<String> names = new TreeSet<>();
		names.add("Vignesh");
		names.add("Ajith");
		names.add("Pradeep");
		names.add("1");
		names.add("Vignesh");
		System.out.println("Set : " + names);

		// Map
		Map<Integer, String> EmpNames = new HashMap<>();
		EmpNames.put(1, "Vignesh");
		EmpNames.put(2, "Ajith");
		EmpNames.put(4, "Praveen");
		EmpNames.put(3, "Vignesh");

		for (Map.Entry<Integer, String> empname : EmpNames.entrySet()) {
			System.out.println("empid: " + empname.getKey() + " " + "empName: " + empname.getValue());
			System.out.println("Uppper case: " + empname.getValue().toUpperCase());
			System.out.println("Length: " + empname.getValue().length());

			if (empname.getValue().startsWith("Vi")) {
				System.out.println("Yes " + empname);
			}
		}
		System.out.println("****************************");
		int num = 10;
		if (num == 10) {
			System.out.println("Double equal :True");
		}

	}

}
