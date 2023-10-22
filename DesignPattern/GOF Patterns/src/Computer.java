
import Visitor.ComputerPart;
import Visitor.ComputerPartVisitor;
import Visitor.Keyboard;
import Visitor.Mouse;
import Visitor.Multimedia;
import javax.management.monitor.Monitor;


public class Computer implements ComputerPart {
	
    ComputerPart[] parts;

    public Computer(){
       parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor() {}, new Multimedia()};		
    } 


    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
       for (int i = 0; i < parts.length; i++) {
          parts[i].accept(computerPartVisitor);
       }
       computerPartVisitor.visit(this);
    }
}