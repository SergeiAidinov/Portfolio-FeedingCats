package ru.yandex.incoming34;

public class Cat {
	private final String name;
	private final int appetite;
	private boolean full = false;

	public boolean isFull() {
		return full;
	}

	public Cat(String name, int appetite) {
		this.name = name;
		this.appetite = appetite;
	}

	public String getName() {
		return name;
	}

	public int getAppetite() {
		return appetite;
	}

	public void eatFromPlate(Plate plate) {
		if (plate.getFood() < appetite) {
			System.out.println("В тарелке недостаточно еды. " + name + " остался голодным.");
		} else {
			plate.decreaseFood(appetite);
			full = true;
			int tempVar = CatFarm.getQuantityOfFullCats();
			tempVar++;
			CatFarm.setQuantityOfFullCats(tempVar);
			System.out.println(name + " насытился.");
		}

	}
}
