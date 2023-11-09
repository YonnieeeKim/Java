package ex_231102.exam_interface_cafe;


public class MusicCDInfo extends CDInfo {
	private String artist;
	private String[] songTitle;

	public MusicCDInfo(String registerNo, String artist, String title, String[] songTitle) {
		super(registerNo, title);
		this.artist = artist;
		this.songTitle = songTitle;
	}

	public void show() {
		System.out.print(artist + " " + super.getTitle() + "[ ");
		for (int i = 0; i < songTitle.length; i++) {
			System.out.print(songTitle[i] + " ");
		}
		System.out.println(" ] 음반");
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String[] getSongTitle() {
		return songTitle;
	}

	public void setSongTitle(String[] songTitle) {
		this.songTitle = songTitle;
	}
	

}


