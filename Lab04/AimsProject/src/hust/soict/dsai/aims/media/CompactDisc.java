package hust.soict.dsai.aims.media;

import java.util.ArrayList;


public class CompactDisc extends Disc implements Playable {
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();

	public CompactDisc(int id, String title, String category, float cost, String artist, ArrayList<Track> tracks) {
		super(id, title, category, cost);
		this.artist = artist;
		this.tracks = tracks;
	}

	public CompactDisc(int id, String title, String category, float cost) {
		super(id, title, category, cost);
	}

	public String getArtist() {
		return artist;
	}

	public void addTrack(Track track) {
		if (!tracks.contains(track)) {
			tracks.add(track);
			System.out.println("Nguyen Dinh Phuc Thanh || " + track + "is added successfully");
		}
		System.out.println(track + " is already in the track list");
	}

	public void removeTrack(Track track) {
		if (tracks.contains(track)) {
			tracks.remove(track);
			System.out.println("Nguyen Dinh Phuc Thanh || " + track + "is removed successfully");
		} else {
			System.out.println("Nguyen Dinh Phuc Thanh || " + track + "is not in the track list");
		}
	}

	public int getLength() {
		int totalLength = 0;
		for (Track track : tracks) {
			totalLength += track.getLength();
		}
		return totalLength;
	}

	@Override
	public void play() {
		System.out.println("Nguyen Dinh Phuc Thanh || Playing CD: " + this.getTitle());
		System.out.println("Nguyen Dinh Phuc Thanh || CD length: " + this.getLength());
		for (Track track : tracks) {
			track.play();
		}
	}

	public String toString() {
		return "CD: " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + getArtist() + " - "
				+ getLength() + "s - $" + getCost();
	}
}
