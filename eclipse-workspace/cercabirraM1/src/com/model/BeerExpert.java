package com.model;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
	List<String> colors = new ArrayList<String>();
	
	public BeerExpert() {
		colors.add("light");
		colors.add("brown");
		colors.add("amber");
		colors.add("dark");	
		colors.add("black");
	}
	
	public List<String> getBrands(String color) {
		List<String> brands = new ArrayList<String>();
		if(color.equals("amber")) {
			brands.add("Jack Amber");
			brands.add("Red Moose");
			brands.add("Amber Rose");
		} else if(color.equals("black")) {
			brands.add("Black Bear");
		}
		else {
			brands.add("Nastro Azzurro");
			brands.add("Peroni");
		}
		return brands;
	}
	
	public List<String> getColors() {
		return colors; 
	}
	
	public boolean isValid(String color) {
		if(colors.contains(color)) return true;
		
		return false;
	}

}
