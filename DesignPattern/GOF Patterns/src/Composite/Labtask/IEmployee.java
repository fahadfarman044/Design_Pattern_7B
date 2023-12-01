/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite.Labtask;

import java.util.Observer;

/**
 *
 * @author fa20-bse-044
 */
interface IEmployee extends Observer {
    void giveBonus(double bonus);
    double calculateSalary();
    Iterable<IEmployee> getSubordinates(); // Iterable for subordinates
}