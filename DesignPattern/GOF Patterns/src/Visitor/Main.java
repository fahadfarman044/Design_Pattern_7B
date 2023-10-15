/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visitor;

/**
 *
 * @author DELL
 */
public class Main {
   public static void main(String[] args) {

      ComputerPart computer = (ComputerPart) new Computer() {
          @Override
          public void accept(ComputerPartDisplayVisitor computerPartDisplayVisitor) {
              throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
          }
      };
      computer.accept(new ComputerPartDisplayVisitor());
   }
}