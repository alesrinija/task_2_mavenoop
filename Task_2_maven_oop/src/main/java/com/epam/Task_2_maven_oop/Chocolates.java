package com.epam.Task_2_maven_oop;

public class Chocolates extends Gift implements Comparable<Chocolates>
{

	public Chocolates (int weight, int sweetness, String color) {
		super(weight, sweetness, color);
	}
	
	public int compareTo(Chocolates chocolate) {
		return chocolate.getSweetness() - this.getSweetness();
	}
}
