/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder.Lab_Task;

import Builder.Packing;

/**
 *
 * @author fa20-bse-044
 */
public abstract class HotDrink implements Item {

	@Override
	public Packing packing() {
            return new DisposibleCup();
	}

	@Override
	public abstract float price();
        
        public void addToppings(){};
}
