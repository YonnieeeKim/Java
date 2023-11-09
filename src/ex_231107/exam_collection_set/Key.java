package ex_231107.exam_collection_set;

public class Key {
	private int number;

	public Key(int number) {
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			Key compareKey = (Key) obj;
			if (this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}
	//업캐스팅 -> 참조변수 : 서브클래스가 가진 필드, 메서드 중 슈퍼클래스로부터 상속받은 필드, 메서드만 접근 가능
	//다운캐스팅 -> 참조변수 : 서브 클래스가 선언한 필드, 메서드 접근

	public int hashCode() {
		return number;
	}

	public String toString() {
		return "number : " + number;
	}

}
