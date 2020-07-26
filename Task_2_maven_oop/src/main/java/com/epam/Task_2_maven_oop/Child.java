package com.epam.Task_2_maven_oop;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Child {
	String name;
	List<Sweets> sweets;
	List<Chocolates> chocolates;
	
	public Child(String name) {
		this.name = name;
		sweets = new ArrayList<Sweets>();
		chocolates = new ArrayList<Chocolates>();
	}
	
	public int getTotalGiftWeight() {
		int total = 0;
		
		for(Sweets sweet:sweets) {
			total = total + sweet.getWeight();
		}
		
		for(Chocolates chocolate:chocolates) {
			total = total + chocolate.getWeight();
		}
		
		return total;
		
	}
	
	public void sortChocolatesBySweetness() {
		Collections.sort(chocolates);
	}
	
	public boolean findSweetInSweets(String name) {
		for(Sweets sweet:sweets) {
			if(sweet.getName().equals(name)) {
				return true;
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public List<Sweets> getSweets() {
		return sweets;
	}

	public List<Chocolates> getChocolates() {
		return chocolates;
	}
	
	public void addChocolate(Chocolates chocolate) {
		chocolates.add(chocolate);
	}
	
	public void addSweet(Sweets sweet) {
		sweets.add(sweet);
	}

}
