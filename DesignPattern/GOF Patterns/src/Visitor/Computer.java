/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visitor;

/**
 *
 * @author DELL
 */
public class Computer implements ComputerPart {
	
    ComputerPart[] parts;

    public Computer(){
       parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor(), new Multimedia()};		
    } 


    public void accept(ComputerPartVisitor computerPartVisitor) {
       for (int i = 0; i < parts.length; i++) {
          parts[i].accept((ComputerPartDisplayVisitor) computerPartVisitor);
       }
       computerPartVisitor.visit(this);
    }

    @Override
    public void accept(ComputerPartDisplayVisitor computerPartDisplayVisitor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
