package exam_collection_set;

import java.util.HashSet;

public class SetInterfaceTest {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("Milk");
		set.add("Bread");
		set.add("Butter");
		set.add("Cheese");
		set.add("Ham");
		set.add("Ham");
		
		System.out.println(set.toString());
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(Integer.valueOf(3));
		set1.add(5);
		set1.add(3);
		set1.add(4);
		
		System.out.println(set1.toString());
	}

}
