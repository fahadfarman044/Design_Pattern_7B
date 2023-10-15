/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oobserver;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class WhiteShirt implements Publisher{
	private ArrayList<Subscriber> subscribers;
	boolean inStock = false;

	public WhiteShirt() {
		subscribers = new ArrayList<Subscriber>();
	}
	
	public boolean isInStock() {
		return inStock;
	}

	public void setInStock(boolean inStock) {
		this.inStock = inStock;
		if(inStock){
			notifySubscribers();
		}
	}

	public void subscribe(Subscriber s) {
		if(!subscribers.contains(s)){
			subscribers.add(s);
		}	
	}

	public void unscubscribe(Subscriber s) {
		if(subscribers.contains(s)){
			subscribers.remove(s);
		}
	}
	
	public void notifySubscribers(){
		for(Subscriber s: subscribers){
			s.update();
		}
	}

    void subscribe(Person Faizan) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
