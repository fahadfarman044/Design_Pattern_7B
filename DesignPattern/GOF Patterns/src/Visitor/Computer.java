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
public abstract class Computer implements ComputerPart {
	
   ComputerPart[] parts;

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


   @Override
   public void accept(ComputerPartVisitor computerPartVisitor) {
      for (int i = 0; i < parts.length; i++) {
         parts[i].accept(computerPartVisitor);
      }
      computerPartVisitor.visit(this);
   }
}