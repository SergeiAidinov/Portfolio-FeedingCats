package ru.yandex.incoming34;

import java.util.Random;

public class Plate {
	private int food;
	Random random = new Random();
	private final int MAX_INCREASE_OF_FOOD = 10;

	public Plate(int food) {
		this.food = food;
	}

	public int getFood() {
		return food;
	}

	public void setFood(int food) {
		this.food = food;
	}

	public void info() {
		System.out.println("plate: " + food);
	}

	public void decreaseFood(int appetite) {
		this.food -= appetite; // food = food - appetite;
	}

	public void addFood() {
		int additionalFood = (random.nextInt(MAX_INCREASE_OF_FOOD) + 1);
		this.food += additionalFood;
		System.out.println("В миску добавлено " + additionalFood + " единиц еды.");

	}
}
