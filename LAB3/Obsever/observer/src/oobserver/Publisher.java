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
public interface Publisher {
	void subscribe(Subscriber s);
	void unscubscribe(Subscriber s);

}