package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
	public List getBrands(String color){
		List<String> brands = new ArrayList<String>();
		
		if(color.equals("ember")){
			brands.add("Jack Amber");
			brands.add("Red Moose");			
		}else{
			brands.add("Pawared");
			brands.add("Rakkamnerd");
		}
		return brands;	
	}
}
