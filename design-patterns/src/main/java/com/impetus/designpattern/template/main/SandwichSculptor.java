package com.impetus.designpattern.template.main;

import com.impetus.designpattern.template.impl.ItalianHoagie;
import com.impetus.designpattern.template.impl.VeggieHoagie;

public class SandwichSculptor {
	
	public static void main(String[] args){
		
		ItalianHoagie cust12Hoagie = new ItalianHoagie();
		
		cust12Hoagie.makeSandwich();
		
		System.out.println();
		
		VeggieHoagie cust13Hoagie = new VeggieHoagie();
		
		cust13Hoagie.makeSandwich();
		
	}
	
}
