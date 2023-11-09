package exam_interface_cafe;

public class BookCDMS {
	public static void main(String[] args) {
		SeparateVolume s = new SeparateVolume("1","엄마를 부탁해","신경숙");
		s.checkOut("홍길동", "20210801");
		s.checkIn();
		
		AppCDInfo c = new AppCDInfo("2","Redhat fedora CD");
		c.checkOut("박희진","20210810");
		c.checkOut(null, null); 
		c.checkIn();
		c.checkIn();
		
		MusicCDInfo m = new MusicCDInfo("20","김동률", "동행",new String[]{"고백","청춘","내 사람"});
		m.show();
	}

}
