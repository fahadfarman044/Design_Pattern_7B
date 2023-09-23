/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SimpleObserver;

import javax.security.auth.Subject;

/**
 *
 * @author DELL
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update(); 
}
