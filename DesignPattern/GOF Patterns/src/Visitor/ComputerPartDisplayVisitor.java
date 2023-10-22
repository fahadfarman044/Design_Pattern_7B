/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visitor;

import javax.management.monitor.Monitor;

/**
 *
 * @author DELL
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    /**
     *
     * @param computer
     */
    @Override
    public void visit(Computer computer) {
       System.out.println("Displaying Computer.");
    }

    /**
     *
     * @param mouse
     */
    @Override
    public void visit(Mouse mouse) {
       System.out.println("Displaying Mouse.");
    }

    /**
     *
     * @param keyboard
     */
    @Override
    public void visit(Keyboard keyboard) {
       System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
       System.out.println("Displaying Monitor.");
    }
    
    @Override
    public void visit(Multimedia multimedia) {
       System.out.println("Displaying Multimedia.");
    }

    public void visit(Visitor.Monitor aThis) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}