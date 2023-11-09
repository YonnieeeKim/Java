package exam_collection_set;

import java.util.Arrays;
import java.util.HashSet;

public class FindDupplication {
	public static void main(String[] args) {
		// Set<String> set = new HashSet<>();
		String[] sample = { "단어", "구절", "의미", "구절", "의미", "단락" };
		HashSet<String> hashSet = new HashSet<>();

		for (String word : sample) {
			if (!hashSet.add(word))
				System.out.println("중복된 단어 : " + word);
		}
		System.out.println("단어 수 : " + hashSet.size());
		System.out.println("중복되지 않은 단어 : " + hashSet.toString());
	}

}
