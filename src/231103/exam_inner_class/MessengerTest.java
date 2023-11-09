package exam_inner_class;

public class MessengerTest {
	public static void main(String[] args) {
		Messenger test = new Messenger() {

			@Override
			public String getMessage() {
				// TODO Auto-generated method stub
				return "점심 맛있게 드셨나요?";
			}

			@Override
			public void setMessage(String msg) {
				System.out.println("test에서 메시지를 설정합니다." + msg);

			}

		};
		System.out.println(test.getMessage());
		test.setMessage("have a nice day");
	}

}
