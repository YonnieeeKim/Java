package exam_collection_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest02 {
	public static void print(int n, List<String> list) {
		System.out.println(n + " : " + list.toString());
	}

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("서울");
		list.add("북경");
		list.add("상해");
		list.add("서울");
		list.add("도쿄");
		list.add("뉴욕");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		list.add("런던");
		list.add("로마");
		list.add("방콕");
		list.add("북경");
		list.add("도쿄");
		list.add("서울");

		System.out.println("1 : " + list.toString());

		list.add(1, "LA");
		print(2, list);
		
		//int indexOf(Object o)/ int last IndexOf(Object o)
		System.out.println("3 : " + list.indexOf("서울"));
		System.out.println("4 : " + list.lastIndexOf("서울"));
		
		//boolean remove(Object o)
		list.remove("LA");
		print(5, list);

		list.remove(list.indexOf("상해"));
		print(6, list);

		System.out.println("7 : " + list.contains("LA"));

		Object obj[] = list.toArray();
		System.out.println("8 : " + Arrays.toString(obj));

		String cities[] = new String[0];

		cities = list.toArray(cities);
		System.out.println("9 : " + Arrays.toString(cities) + " " + cities.length);

		list.clear();
		print(10, list);

		System.out.println("11 : " + list.isEmpty());

		list.add("파리");
		list.add("방콕");
		list.add("LA");

		String[] names = new String[] { "서울", "뉴욕", "상해" };
		List<String> list2 = Arrays.asList(names);
		print(12, list2);

		List<String> list3 = Arrays.asList("서울", "부산", "상해");
		list.addAll(list2);
		print(13, list);

		System.out.println("14 : " + list.containsAll(list3));

		list.retainAll(list2);
		print(15, list);

		list.removeAll(list2);
		print(16, list);
	}

}
