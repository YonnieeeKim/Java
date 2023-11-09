package ex_231102.exam_interface_cafe;


public class AppCDInfo extends CDInfo implements Lendable {
	private String borrower;
	private String checkOutDate;
	private boolean state = true;

	@Override
	public void checkOut(String borrower, String checkOutDate) {
		if (!state) {
			System.out.println("현재 대여중..\n");
			return;
		}
		this.borrower = borrower;
		this.checkOutDate = checkOutDate;
		state = false;
		System.out.println("*" + getTitle() + "이(가) 대출되었습니다.");
		System.out.println("대출인 : " + borrower);
		System.out.println("대출일 : " + checkOutDate);
		System.out.println();
	}

	@Override
	public void checkIn() {
		if (state) {
			System.out.println("이미 반납 처리가 완료되었습니다.\n");
			return;
		}
		this.borrower = null;
		this.checkOutDate = null;
		this.state = true;
		System.out.println("*" + getTitle() + "이(가) 반납되었습니다.");
		System.out.println();
	}

	public AppCDInfo(String registerNo, String title) {
		super(registerNo, title);
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
