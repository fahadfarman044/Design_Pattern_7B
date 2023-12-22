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
 public class AC implements Device {
       private boolean on = false;
       private int temperature = 25;

       @Override
       public boolean isEnabled() {
           return on;
       }

       @Override
       public void enable() {
           on = true;
       }

       @Override
       public void disable() {
           on = false;
       }

       public int getTemperature() {
           return temperature;
       }

       public void setTemperature(int temperature) {
           if (temperature < 18) {
               this.temperature = 18;
           } else if (temperature > 30) {
               this.temperature = 30;
           } else {
               this.temperature = temperature;
           }
       }

       @Override
       public void printStatus() {
           System.out.println("------------------------------------");
           System.out.println("| I'm AC unit.");
           System.out.println("| I'm " + (on ? "enabled" : "disabled"));
           System.out.println("| Current temperature is " + temperature + "°C");
           System.out.println("------------------------------------\n");
       }

    @Override
    public int getVolume() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setVolume(int percent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getChannel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setChannel(int channel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   }