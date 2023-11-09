package exam_collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class SortTest {
	public static void main(String[] args) {
		// 객체 배열을 선언하여 포도-300 수박-20000 딸기-11900 저장
		// 1-1 객체 배열의 값에서 가격순으로 정렬하여 출력 (오름차순)
		Fruit array[] = { new Fruit("포도", 3000), new Fruit("수박", 20000), new Fruit("딸기", 11900) };

		// 배열 정렬코드
		Arrays.sort(array);
		System.out.println("배열값 : " + Arrays.toString(array));
		System.out.println();

		// 2. 그 값을 리스트 타입으로 변환하여 컬렌션 클래스의 정렬메서드를 사용하여 정렬한 후 출력
		List<Fruit> list = Arrays.asList(array);

		// 오름차순 정렬코드
		Collections.sort(list);
		System.out.println("오름차순 : " + list.toString());

		// 내림차순 정렬코드
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("내림차순 : " + list.toString());
		System.out.println();

		// 3. TreeSet에 저장하여 출력한다 가격순으로 정렬
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>();
		treeSet.add(new Fruit("포도", 3000));
		treeSet.add(new Fruit("수박", 20000));
		treeSet.add(new Fruit("딸기", 11900));
		treeSet.add(new Fruit("딸기", 11900));
		System.out.println("결과값 : " + treeSet.toString());

	}
}
