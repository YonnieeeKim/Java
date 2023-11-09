package ex_231102.exam_interface_cafe;


public class SeparateVolume implements Lendable {
	private String requestNo;
	private String bookTitle;
	private String writer;
	private String borrower;
	private String checkOutDate;
	private boolean state = true;

	public SeparateVolume(String requestNo, String bookTitle, String writer) {
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
	}

	@Override
	public void checkOut(String borrower, String checkOutDate) {
		if (!state)
			return;
		System.out.println("*" + bookTitle + "(" + writer + ")" + "이(가) 대출되었습니다.");
		System.out.println("대출인 : " + borrower);
		System.out.println("대출일 : " + checkOutDate);
		System.out.println();
		state = false;

	}

	@Override
	public void checkIn() {
		if (state) {
			System.out.println("이미 반납 처리가 완료되었습니다.");
			return;
		}
		System.out.println("*" + bookTitle + "(" + writer + ")" + "가 반납되었습니다.");
		System.out.println();
		state = true;

	}

	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getBorrower() {
		return borrower;
	}

	public void setBorrower(String borrower) {
		this.borrower = borrower;
	}

	public String getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

}