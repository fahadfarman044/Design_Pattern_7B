/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Visitor;

/**
 *
 * @author DELL
 */
public interface ComputerPart {
   public void accept(ComputerPartVisitor computerPartVisitor);

    public void accept(ComputerPartDisplayVisitor computerPartDisplayVisitor);
}
