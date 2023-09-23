/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oobserver;

/**
 *
 * @author FA20-BSE-044
 */
public class Demo {

	public static void main(String[] args) {
		WhiteShirt shirt = new WhiteShirt();
		
		Person  Faizan = new Person("Faizan");
		Person Hashir = new Person ("Hashir");
		Person Fahad = new Person ("Fahad");
		
		shirt.subscribe(Faizan);
		shirt.subscribe(Hashir);
		
		shirt.setInStock(true);
		shirt.setInStock(false);
		
		shirt.unscubscribe(Faizan);
		shirt.setInStock(true);
		

	}

}