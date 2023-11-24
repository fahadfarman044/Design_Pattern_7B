/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command.SubExpertExample;

import javafx.scene.effect.Light;

/**
 *
 * @author fa20-bse-044
 */
//Concrete Command

public class LightOnCommand implements Command1 {

    // reference to the light
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    LightOnCommand(Command.SubExpertExample.Light light) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void execute() {
        light.switchOn();
        System.out.println("Light is on");
    }

}