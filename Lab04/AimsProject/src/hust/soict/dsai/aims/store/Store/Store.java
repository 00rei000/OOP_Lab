package hust.soict.dsai.aims.store.Store;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;

public class Store {
	private ArrayList<Media> itemsInStore = new ArrayList<Media>();

	public void addMedia(Media media) {
		itemsInStore.add(media);
		System.out.println(media.getTitle() + " is added successfully (Nguyen Dinh Phuc Thanh)");
	}

	public void removeMedia(Media media) {
		for (Media item : itemsInStore) {
			if (item.equals(media)) {
				itemsInStore.remove(item);
				System.out.println(media.getTitle() + " is removed successfully (Nguyen Dinh Phuc Thanh)");
				return;
			}
		}
		System.out.println("Not found");
	}

	public ArrayList<Media> ItemsInStore() {
		return itemsInStore;
	}
}
