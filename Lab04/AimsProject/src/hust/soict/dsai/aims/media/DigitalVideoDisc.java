package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
	private String director;
	private int length;

	public DigitalVideoDisc(int id, String title, String category, float cost) {
		super(id, title, category, cost);
	}

	public String getDirector() {
		return director;
	}

	public int getLength() {
		return length;
	}

	@Override
	public void play() {
		System.out.println("Nguyen Dinh Phuc Thanh || Playing DVD: " + this.getTitle());
		System.out.println("Nguyen Dinh Phuc Thanh || DVD length: " + this.getLength());
	}

	public String toString() {
		return "DVD: " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + getLength() + "s - $"
				+ getCost();
	}
}
