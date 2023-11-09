package exam_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapExample2 {
	public static void main(String[] args) {
		HashMap<Integer, Student> st = new HashMap<Integer, Student>();
		st.put(1, new Student(99030001, "홍길동"));
		st.put(2, new Student(99030002, "김도훈"));
		st.put(3, new Student(99030003, "윤도희"));

		System.out.println(st.toString());
		System.out.println();

		Set<Integer> keySet = st.keySet();
		Iterator<Integer> it = keySet.iterator();

		while (it.hasNext()) {
			Integer key = it.next();
			Student sst = st.get(key);
			System.out.println(key + " " + sst.toString());
		}
		System.out.println();
		
		//키와 값의 한 쌍으로 구성된 객체를 set에 담아서 리턴
		for (Map.Entry<Integer, Student> s : st.entrySet()) {
			Integer key = s.getKey();
			Student value = s.getValue();
			System.out.println("key = " + key + ", value = " + value);
		}
		System.out.println();
		
		//key = 학생정보 , value = 점수
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		map.put(new Student(70010001, "홍길동"), 95);
		map.put(new Student(70010001, "홍길동"), 89);

		System.out.println("총 Entry 수 : " + map.size());
		System.out.println(map.toString());
		System.out.println();

		for (Student student : map.keySet()) {
			System.out.println(student + "=> " + map.get(student));
		}
		System.out.println();

		TreeMap<String, Student> tMap = new TreeMap<String, Student>();
		tMap.put("1", new Student(94010001, "홍길동"));
		tMap.put("4", new Student(95020001, "김희진"));
		tMap.put("2", new Student(97010001, "윤도희"));
		tMap.put("3", new Student(99030003, "김철수"));

		for (String key : tMap.keySet()) {
			System.out.println(key + " " + tMap.get(key));
		}
		System.out.println();

		TreeMap<Student, Integer> sMap = new TreeMap<>();
		sMap.put(new Student(97010001, "윤도희"), 89);
		sMap.put(new Student(95020001, "김희진"), 90);
		sMap.put(new Student(94010001, "홍길동"), 99);
		sMap.put(new Student(99030003, "김철수"), 79);

		for (Map.Entry<Student, Integer> sd : sMap.entrySet()) {
			Student key = sd.getKey();
			Integer value = sd.getValue();
			System.out.println("key=" + key + ", value=" + value);
		}
	}

}
