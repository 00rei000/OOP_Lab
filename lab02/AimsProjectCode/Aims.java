package AimsP;

public class Aims {
	public static void main(String args[]) {

		Cart order = new Cart();

		DigitalVideoDisc dvd1 = new DigitalVideoDisc("One piece", "Anime", "Oda Eiichirou", 90, 25.50f);
		order.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Grand Blue", "Comedy", "Kenji Inoue", 90, 20.15f);
		order.addDigitalVideoDisc(dvd2);

		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Naruto", "Anime", 21.30f);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Bleach", "Anime", 22.50f);
		order.addDigitalVideoDisc(dvd3);
		order.addDigitalVideoDisc(dvd4);
		order.removeDigitalVideoDisc(dvd2);
		System.out.printf("Total cost is: %.2f\n", order.totalcost());
	}
}
