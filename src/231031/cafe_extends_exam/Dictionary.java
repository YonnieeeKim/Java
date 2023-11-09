package cafe_extends_exam;

public class Dictionary extends PairMap {
	public String get(String key) {
		String s = null;
		for (int i = 0; i < keyArray.length; i++) {
			if(keyArray[i]==key) {
				s = valueArray[i];
			}
		}
		return s;
	}
	
	public void put(String key, String value) {
		for (int i = 0; i < keyArray.length; i++) {
			if(keyArray[i]==key) {
				keyArray[i]=null;
				
			}
		}
	}

	@Override
	public String delete(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}
}
