/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy.labTask;

/**
 *
 * @author fa20-bse-044
 */
public class ProtectedImage implements Image {
    public void display(String imageType) {
        System.out.println("Displaying image for correct user of Type "+imageType);
    }
}
