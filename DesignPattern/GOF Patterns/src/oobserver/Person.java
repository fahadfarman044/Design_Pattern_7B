/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oobserver;

/**
 *
 * @author DELL
 */
public class Person implements Subscriber{
	String name;
	

	public Person(String name) {
		this.name = name;
	}


	public void update() {
		System.out.println("Hello "+name+", product is now in stock");
		
	}

}