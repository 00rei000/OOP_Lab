package hust.soict.dsai.aims.Aims;

import hust.soict.dsai.aims.cart.Cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;


public class Aims {
	public static void main(String args[]) {
		Cart order = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Doraemon the movie", "Anime", "Zen Soichiro", 90, 25.50f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Spiderman no way home", "Science Fiction", "Jon Watts", 90,
				30.15f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Naruto", "Anime", "Hayato-date", 60, 21.30f);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Diary of a Wimpy Kid", "Comedy", "Thor Freudenthal", 85, 40.50f);
		order.addDigitalVideoDisc(dvd1);
		order.addDigitalVideoDisc(dvd2);
		order.addDigitalVideoDisc(dvd3);
		order.addDigitalVideoDisc(dvd4);
		order.search("Doraemon the movie");
	}
}
