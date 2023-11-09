package ex_231109.exam_try_with_resources;

public class TryWithResourceExample {
	public static void main(String[] args) {
		try(FileInputStream01 fis = new FileInputStream01("file.txt")){
			fis.read();
		}catch (Exception e) {
			System.out.println("예외처리 코드가 실행되었습니다.");
		}
	}

}
