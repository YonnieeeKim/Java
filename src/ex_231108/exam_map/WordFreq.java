package ex_231108.exam_map;

import java.util.HashMap;
import java.util.Map;

public class WordFreq {
	// 문자열에 포함된 단어의 빈도를 계산하여 단어를 key로 빈도를 ,value로 저장해 출력

	public static void main(String[] args) {
		String[] sample = { "to", "be", "or", "not", "to", "be", "is", "a", "problem" };
		Map<String, Integer> m = new HashMap<String, Integer>();

		for (String a : sample) {
			Integer freq = m.get(a);
			m.put(a, (freq == null) ? 1 : freq + 1);
		}

		System.out.printf("총 단어 수 : %d개 \n", m.size());
		System.out.println(m.toString());

	}

}
