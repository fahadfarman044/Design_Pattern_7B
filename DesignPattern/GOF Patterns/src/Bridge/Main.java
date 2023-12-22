/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge;

/**
 *
 * @author fa20-bse-044
 */
public class Main {
       public static void main(String[] args) {
           testDevice(new Tv());
           testDevice(new Radio());
           testDevice(new AC()); // Test AC
       }

       public static void testDevice(Device device) {
           System.out.println("Tests with basic remote.");
           BasicRemote basicRemote = new BasicRemote(device);
           basicRemote.power();
           device.printStatus();

           System.out.println("Tests with advanced remote.");
           AdvancedRemote advancedRemote = new AdvancedRemote(device);
           advancedRemote.power();
           advancedRemote.mute();
           device.printStatus();
       }
   }
   
