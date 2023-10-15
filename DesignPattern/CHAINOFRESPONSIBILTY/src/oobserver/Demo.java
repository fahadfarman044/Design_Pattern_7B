/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oobserver;

/**
 *
 * @author DELL
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