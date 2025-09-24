package LearnJava;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class problemSolving {
	public static void main(String[] args) {
		int[] arrs= {1,4,5,6,2,3,1};
		Set<Integer> arrNum=new HashSet<>();
		for(int arr:arrs) {
			arrNum.add(arr);
		}
		System.out.println(arrNum);
	
	String name="Hello world";
	
	for(int i=name.length()-1;i>=0;i--) {
		System.out.print(name.charAt(i));
	}
	System.out.println();
	
	int[] nums= {7,4,5,6,8};
	Arrays.sort(nums);          //  {4,5,6,7,8}
	int largest=nums[nums.length-1]; // largest=nums[4] which means =8
	for(int i=nums.length-2;i>=0;i--) {
		if(nums[i]!=largest)
			System.out.println("Second largest number : "+nums[i]);
		break;
	}
	
	}

}
