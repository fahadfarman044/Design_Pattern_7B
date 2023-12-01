/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite.Labtask;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author fa20-bse-044
 */
public class EmployeeMain {
    public static void main(String[] args) {
            Director director = new Director("Prof. Maroof Shah (Director)", 20000);
            HOD hod1 = new HOD("Prof. Mazhar (HOD)", 700000);
            HOD hod2 = new HOD("Prof. Ahmad Saeed khatak (HOD)", 35000);
            Teacher teacher1 = new Teacher("Jawad Khan (Teacher)", 50000);
            Teacher teacher2 = new Teacher("Mukhtiyar Zamin (Teacher)", 300000);
            DOO doo = new DOO("Sumair Khan  (DOO)", 200000);

            director.addSubordinate(hod1);
            director.addSubordinate(hod2);
            hod1.addSubordinate(teacher1);
            hod2.addSubordinate(teacher2);
            director.addSubordinate(doo);
            
            EmployeeController controller = new EmployeeController();
            String organogram = controller.generateOrganogram(director);

            System.out.println("Organization Hierarchy:");
            System.out.println(organogram);
            System.out.println();

            // Giving a bonus to all employees using Iterator
            giveBonusToAllEmployees((IEmployee) director);
    }
    
    public static void giveBonusToAllEmployees(IEmployee employee) {
        Queue<IEmployee> queue = new LinkedList<>();
        queue.offer(employee);

        while (!queue.isEmpty()) {
            IEmployee currentEmployee = queue.poll();
            
            //10% bouns to all
            double bonus = 0.10;
            currentEmployee.giveBonus(bonus);
//            currentEmployee.giveBonus(1000);

            for (IEmployee subordinate : currentEmployee.getSubordinates()) {
                queue.offer(subordinate);
            }
        }
    }
}