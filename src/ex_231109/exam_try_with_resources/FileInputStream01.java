package ex_231109.exam_try_with_resources;

public class FileInputStream01 implements AutoCloseable {
	private String file;

	public FileInputStream01(String file) {
		this.file = file;
	}

	public void read() {
		System.out.println(file + "을 읽습니다.");
	}

	@Override
	public void close() throws Exception {
		System.out.println(file + "을 닫습니다.");

	}
	

}
