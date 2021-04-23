package ru.yandex.incoming34;

public class CatFarm {

	private final int QUANTITY_OF_CATS = 5;
	Cat[] cats = new Cat[QUANTITY_OF_CATS];
	private final int INITIAL_FOOD = 8;
	private static int quantityOfFullCats = 0;

	public static int getQuantityOfFullCats() {
		return quantityOfFullCats;
	}

	public static void setQuantityOfFullCats(int quantityOfFC) {
		quantityOfFullCats = quantityOfFC;
	}

	public void sequense() {
		createCatFarm();
		Plate plate = new Plate(INITIAL_FOOD);
		feedAllCats(cats, plate);
		System.out.println("Все кошки сыты!");
	}

	private void createCatFarm() {
		cats[0] = new Cat("Барсик", 7);
		cats[1] = new Cat("Мурка", 3);
		cats[2] = new Cat("Тишка", 5);
		cats[3] = new Cat("Снежка", 4);
		cats[4] = new Cat("Кузька", 6);
	}

	private void feedAllCats(Cat[] cats, Plate plate) {

		do {

			for (int i = 0; i < cats.length; i++) {
				System.out.println("В миске " + plate.getFood() + " единиц еды.");
				if (cats[i].isFull()) {
					System.out.println(cats[i].getName() + " уже сыт.");
					continue;
				} else {
					cats[i].eatFromPlate(plate);

				}

			}
			System.out.println();
			if ((cats.length - quantityOfFullCats) > 0) {
				plate.addFood();
			} else {
				System.out.println("Нет необходимости пополнять миску.");
				System.out.println("В миске осталось " + plate.getFood() + " единиц еды.");
			}

		} while ((cats.length - quantityOfFullCats) > 0);
	}

}
