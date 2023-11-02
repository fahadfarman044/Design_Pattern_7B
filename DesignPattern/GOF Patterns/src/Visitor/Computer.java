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

<<<<<<< HEAD
    public Computer(){
       parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor(), new Multimedia()};		
    } 
=======
   public Computer(){
   parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor() {
         
          public void start() {
              throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
          }

          @Override
          public void stop() {
              throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
          }
      }};		
   } 
>>>>>>> 017b5f17770cde63f63e1b03c5c6cb8ce88632d1


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
