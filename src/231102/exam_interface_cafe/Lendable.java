package exam_interface_cafe;

public interface Lendable {
	//public static final String borrower = "";
	//public static final String checkOutDate = "";
	
	public abstract void checkOut(String Borrower, String checkOutDate);
	public abstract void checkIn();

}
