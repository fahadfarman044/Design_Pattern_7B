/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SimpleObserver;

/**
 *
 * @author DELL
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        
        new HexaObserver(subject);
        OctalObserver obj = new OctalObserver(subject);
        new BinaryObserver(subject);
        
        System.out.println("Here all Observers all attached: ");
        System.out.println("First state change: 15");
       subject.setState(15);
        
        System.out.println("\nDetaching Octal Observer Here...");
        subject.Detach(obj);
        
        System.out.println("\nHere two Observers all attached: ");
        System.out.println("First state change: 10");
      subject.setState(10);
    }
    
}
