/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder.Lab_Task;

/**
 *
 * @author fa20-bse-044
 */
public class SugerFreePepsi extends ColdDrink {

   @Override
   public float price() {
      return 40.0f;
   }

   @Override
   public String name() {
      return "SugerFreePepsi";
   }
}