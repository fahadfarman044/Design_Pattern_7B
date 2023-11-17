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
public class Demo {
    public static void main(String[] args) {

        // 1. Proxy Pattern as Smart Reference by action verification
        //    Action: Only display image if supported type otherwise fake
        Image image = new ProxyImage("test_10mb.jpg","png");
        image.display("jpg");
        image.display("png");
        System.out.println("");

        // 2. Remote Proxy Image: If source is correct then load from it the real image,
        // otherwise fake image.
        Image img = new RemoteProxyImage("Comsis.com");
        img.display("comsis.com");
        img.display("Comsis.com");

        // 3. Protected Proxy: Real Image should load for authenticated user only
        Image protectedImage = new ProtectedProxyImage("AHMAD");
        protectedImage.display("png");
        protectedImage = new ProtectedProxyImage("KHAN");
        protectedImage.display("png");
    }
}
